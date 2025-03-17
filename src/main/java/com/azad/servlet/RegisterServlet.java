package com.azad.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.azad.doa.UserDao;
import com.azad.doa.UserDo;
import com.azad.doa.User;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDo userdo = new UserDao();
    
    public RegisterServlet() {
        super();
        
    }

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password  = request.getParameter("password");
		String email = request.getParameter("email");
		
		User user = new User();
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		if(userdo.addUser(user)) {
			response.sendRedirect("login.jsp?registration=success");
		}
		else {
			response.sendRedirect("register.jsp?error=1");
		}
		
		
	}

}
