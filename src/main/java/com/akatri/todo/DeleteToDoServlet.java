package com.akatri.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.akatri.todo.ToDoListService;

/**
 * Servlet implementation class DeleteToDoServlet
 */
@WebServlet(urlPatterns = "/deletetodo.do")
public class DeleteToDoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ToDoListService listService = new ToDoListService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteToDoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		listService.delete(name, request.getParameter("category"));
		response.sendRedirect("/todo.do");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
