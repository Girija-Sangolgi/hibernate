package com.xworkz.userapp.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user")
public class UserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

           //processing logic

        String user = req.getParameter("userName");
        String number = req.getParameter("phoneNumber");
        String email = req.getParameter("email");
        String pwd = req.getParameter("password");
        String conPwd = req.getParameter("confirmPassword");

             //request scope
        req.setAttribute("name",user);

        //servlet chaining
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
        requestDispatcher.forward(req,resp);

    }
}
