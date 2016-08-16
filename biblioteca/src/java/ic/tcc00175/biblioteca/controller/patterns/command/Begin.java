package ic.tcc00175.biblioteca.controller.patterns.command;

import ic.tcc00175.biblioteca.view.Tabela;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Begin extends ServletCommand {

    public void execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Tabela tabela = (Tabela) request.getSession().getAttribute("tabela");
        if (tabela != null) {
            tabela.begin();
        }
        request.getRequestDispatcher(request.getParameter("page")).forward(
                request, response);
    }

    public void execute() {
        // TODO Auto-generated method stub
    }
}