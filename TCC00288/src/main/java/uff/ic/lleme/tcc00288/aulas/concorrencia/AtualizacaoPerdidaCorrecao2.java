package uff.ic.lleme.tcc00288.aulas.concorrencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.postgresql.util.PSQLException;
import uff.ic.lleme.tcc00288.aulas.concorrencia.util.Config;
import uff.ic.lleme.tcc00288.aulas.concorrencia.util.Transacao;

public class AtualizacaoPerdidaCorrecao2 {

    public static void main(String[] args) throws InterruptedException {
        Config.initBD();
        Transacao t1 = iniciarTransacaoT1();
        Transacao t2 = iniciarTransacaoT2();
        t1.join();
        t2.join();
    }

    private static Transacao iniciarTransacaoT1() throws InterruptedException {
        Transacao t = new Transacao(1) {
            @Override
            public void run() {
                try {
                    Class.forName("org.postgresql.Driver");
                    try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TCC00288", "postgres", "fluminense");) {
                        this.conn = conn;

                        // -------------------------------------------------------------------------------------------
                        try {

                            long x = 0;
                            {// Parte 1
                                iniciarTransacaoComIsolamento();
                                x = lerX("for update");
                                int N = 5;
                                x = x - N;
                                System.out.println(String.format("Transacao 1 faz x = %d - %d = %d", x + N, N, x));
                                escreverX(x);
                                processar(2000);
                            }

                            long y = 0;
                            {// Parte 2
                                y = lerY("for update");
                                processar(2000);
                            }

                            {// Parte 3
                                int N = 3;
                                y = y + N;
                                System.out.println(String.format("Transacao 1 faz y = %d + %d = %d", y - N, N, y));
                                escreverY(y);
                            }

                            {// Parte 4
                                System.out.println("");
                                long novox = lerX("");
                                System.out.println(String.format("Transacao 1 le x = %d como anteriormente.                      <---", novox, x));
                                System.out.println(String.format("Transacao 1 teve todos os seus efeitos registrados.            <---"));

                                conn.commit();
                                System.out.println("Transacao 1 confirma processamento e libera bloqueios.         <---");
                                System.out.println("");
                            }

                        } catch (SQLException e) {
                            conn.rollback();
                        }
                        // -------------------------------------------------------------------------------------------

                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        };
        t.start();
        return t;
    }

    private static Transacao iniciarTransacaoT2() throws InterruptedException {
        Transacao t = new Transacao(2) {
            private boolean erroDeSerializacao;

            @Override
            public void run() {
                do
                    try {
                        Class.forName("org.postgresql.Driver");
                        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TCC00288", "postgres", "fluminense");) {
                            this.conn = conn;

                            // -------------------------------------------------------------------------------------------
                            try {

                                long x = 0;
                                {// Parte 1
                                    iniciarTransacaoComIsolamento();
                                    processar(1000);
                                    System.out.println(String.format("Transacao 2 tenta bloquear X e aguarda T1 confirmar ou nao para declarar conflito de serializabilidade.", x));
                                    x = lerX("for update");
                                    int N = 8;
                                    x = x - N;
                                    System.out.println(String.format("Transacao 2 faz x = %d - %d = %d", x + N, N, x));
                                    processar(2000);
                                }

                                {// Parte 2
                                    escreverX(x);
                                    conn.commit();
                                    System.out.println("Transacao 2 confirma processamento e libera bloqueios.         <---");
                                    erroDeSerializacao = false;
                                }

                            } catch (PSQLException e) {
                                conn.rollback();
                                if (e.getSQLState().equals("40001")) {
                                    System.out.println("Transacao 2 ira reiniciar por problemas de serializacao.");
                                    erroDeSerializacao = true;
                                }
                            }
                            // -------------------------------------------------------------------------------------------

                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                while (erroDeSerializacao);
            }
        };
        t.start();
        return t;
    }
}
