package com.akatri.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.akatri.todo.ToDoListService;

/**
 * Servlet implementation class ToDoServlet
 */
@WebServlet(urlPatterns = "/add-todo.do")
public class AddToDoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ToDoListService listService = new ToDoListService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddToDoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/views/add-todo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String toAdd = request.getParameter("newToDo");
		String category = request.getParameter("category");
		listService.add(toAdd,category);
		response.sendRedirect("/todo.do");
	}

}
