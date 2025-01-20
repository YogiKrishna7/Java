package com.exmaple;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/app1")
public class app1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public app1() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("uname");
        String password = request.getParameter("pass");

        String path = request.getContextPath();
        
        response.setContentType("text/html");
        
//        String dusername = "yogi";
        String dpass = "123";
        
        if(dpass.equalsIgnoreCase(password)) {
//            response.getWriter().println(
//                    "<!DOCTYPE html>" +
//                    "<html>" +
//                    "<head>" +
//                    "<title>Dynamic HTML Page</title>" +
//                    "<style>" +
//                    "body { font-family: Arial, sans-serif; margin: 20px; }" +
//                    "h1 { color: #333; }" +
//                    "</style>" +
//                    "</head>" +
//                    "<body>" +
//                    "<h1>Welcome, " + username + "!</h1>" +
//                    "<p>Your password is: " + password + "</p>" +
//                    "<a href='" + path + "/home.html'>Go Back</a>"+
//                    "</body>" +
//                    "</html>"
//            );
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("/home.html");
            dispatcher.forward(request, response);
        }
        
        response.getWriter().print("Invalid Password");
     
    }

}
