package ca.sait.cprg352.lab4.servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lisa Jowett
 */
public class LoginServlet extends HttpServlet 
{
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String query = request.getQueryString();

        if(query != null && query.contains("logout"))
        {

        }

        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String username = request.getParamter("username");
        String password = request.getParamter("password");

        if(username == null || username.isEmpty() || password == null || password.isEmpty())
        {
            request.setAttribute("message", "Username or password is missing.");
        }
        else
        {

        }
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }


}
