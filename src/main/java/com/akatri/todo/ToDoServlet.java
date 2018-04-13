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
@WebServlet(urlPatterns = "/todo.do")
public class ToDoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ToDoListService listService = new ToDoListService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ToDoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("toDoList", listService.getToDoList());
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
	}

	

}
