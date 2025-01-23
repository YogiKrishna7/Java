package com.exmaple;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	ArrayList<Movie> movieList = new ArrayList<Movie>();
	@Override
		public void init() throws ServletException {
			Movie m1 = new Movie("Kung Fu Panda", "8", "2008", 1.30);
			
			movieList.add(m1);
		}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/dashboard.html");
		dispatcher.forward(request, response);
	}

}
