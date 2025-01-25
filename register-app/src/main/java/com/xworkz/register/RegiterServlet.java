package com.xworkz.register;

import com.xworkz.register.dto.RegisterDto;
import com.xworkz.register.service.RegisterService;
import com.xworkz.register.service.RegisterServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/user")
public class RegiterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("userName");
        String pwd = req.getParameter("password");

        RegisterDto dto = new RegisterDto();
        dto.setUserName(name);
        dto.setPassword(pwd);

        RegisterService service = new RegisterServiceImpl();
        service.validateUser(dto);

//       RegisterService service = new RegisterServiceImpl();
////        service.validateUser(dto);
//
//        RegisterDto dto1 = service.getAllUsers(1);
//        System.out.println(dto1);

        req.setAttribute("key",name);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("register.jsp");
        requestDispatcher.forward(req,resp);

//        RegisterService service1 = new RegisterServiceImpl();
//        RegisterDto dto = new RegisterDto();

//        RegisterDto dto = new RegisterDto();
//        dto.setUserName(name);
//        dto.setPassword(name1);
//
    //    RegisterService service = new RegisterServiceImpl();
//        service.validateUser(dto);

//        PrintWriter writer = resp.getWriter();
//        writer.print("Thank you" + name + "for registering");

    }
}
