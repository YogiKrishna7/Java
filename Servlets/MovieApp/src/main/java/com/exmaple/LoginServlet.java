package com.exmaple;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static ArrayList<User> userList = new ArrayList<>();

    static {
        userList.add(new User("Yogendra", "9866709807", "yogendra@gmail.com", "1234567"));
        userList.add(new User("Prasad", "1234567891", "prasad@gmail.com", "456"));
        userList.add(new User("Steve", "1234567892", "steve@gmail.com", "789"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");

        for (User user : userList) {
            if (user.getPhoneNumber().equals(phone)) {
                if (user.getPassword().equals(password)) {

                    Cookie loginCookie = new Cookie("user", phone);
                    loginCookie.setMaxAge(10);
                    response.addCookie(loginCookie);
                    
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/dashboard");
                    dispatcher.forward(request, response);
                    
                } else {
                    response.getWriter().println("Invalid Password");
                    return;
                }
            }
        }

        response.getWriter().println("Account Not Present");
    }
}
