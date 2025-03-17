package com.azad.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.azad.doa.UserDao;
import com.azad.doa.UserDo;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private static UserDo userdo = new UserDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password  = request.getParameter("password");
		
		
			try {
				if(userdo.isvalidUser(username,password)) {
					HttpSession session = request.getSession();
					session.setAttribute("username",username);
					response.sendRedirect("welcome.jsp");
				}
				else{
					response.sendRedirect("login.jsp?error=1");
					System.out.println("Error Occured");
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} 
	}


