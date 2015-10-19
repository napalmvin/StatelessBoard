/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.napalmvin.stateless_board.controller;

import com.napalmvin.board_list.ejb.BoardListBean;
import com.napalmvin.board_list.ejb.BoardRecord;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet {

    @EJB
    BoardListBean listBean;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            printHeader(out, request);
            printTable(listBean, out);

            printFooter(out);

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void printHeader(PrintWriter out, HttpServletRequest request) {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>StatelessBoard</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Path: " + request.getContextPath() + "</h1>");
        out.println("<h2>Path: Board </h2>");
    }

    private void printFooter(PrintWriter out) {
        out.println("</body>");
        out.println("</html>");
    }

    private void printTable(BoardListBean listBean, PrintWriter out) {
        out.println("<table>");
        out.println("<tr>");
        out.println("<td>ID</td><td>DESCRIPTION</td>");
        out.println("</tr>");
        for (BoardRecord record : listBean.getList()) {
            out.println("<tr>");
            out.println("<td>"+record.getId()+"</td><td>"+record.getDescription()+"</td>");
            out.println("</tr>");
        }
        out.println("</table>");
    }

}
