package trabalhos.s20141.teste2;

public class Multiplicacao extends OperacaoBinaria {

    public Multiplicacao(Matriz oper1, Matriz oper2) {
        super(oper1, oper2);
        if (getOper1() == null || getOper2() == null || getOper1().linhas() != getOper2().linhas() || getOper1().colunas() != getOper2().colunas())
            throw new IllegalArgumentException();
    }

    @Override
    public Matriz calcular() {
        Matriz resultado = null;
        // implementacao da multiplicacao
        return resultado;
    }

}
