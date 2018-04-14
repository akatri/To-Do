package com.akatri.users;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.akatri.todo.ToDoListService;

@WebServlet(urlPatterns = "/register.to")
public class RegisterServlet extends HttpServlet {
	UserService userService=new UserService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.getRequestDispatcher("WEB-INF/views/register.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
            String name=request.getParameter("username");
            String password= request.getParameter("password");
            Long num=Long.valueOf(request.getParameter("phonenum"));
            String unique=name+password;
            userService.createUser(unique,name, password,num);
            response.sendRedirect("/login.do");
            
           
	}

}
