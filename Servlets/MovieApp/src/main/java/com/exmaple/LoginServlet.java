package com.exmaple;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static ArrayList<User> userList = new ArrayList<>();

    static {
        userList.add(new User("Yogendra", "1234567891", "yogendra@gmail.com", "123"));
        userList.add(new User("Prasad", "1234567892", "prasad@gmail.com", "456"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        boolean valid = false;

        for (User user : userList) {
            if (user.getPhoneNumber().equals(phone)) {
                if (user.getPassword().equals(password)) {
                    valid = true;
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/dashboard");
                    dispatcher.forward(request, response);
                    return;
                } else {
                    response.getWriter().println("Invalid Password");
                    return;
                }
            }
        }

        if (!valid) {
            response.getWriter().println("Account Not Present");
        }
    }
}
