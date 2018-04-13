package com.akatri.todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoListService {

	private static List<ToDoList> toDoList = new ArrayList<>();

	static {
		toDoList = new ArrayList<>();
		toDoList.add(new ToDoList("Learn JSP & Servlets","Education"));
		toDoList.add(new ToDoList("Learn Spring MVC","Education"));
		toDoList.add(new ToDoList("Learn JPA & Hibernate","Education"));

	}

	public List<ToDoList> getToDoList() {

		return toDoList;
	}

	public void add(String toAdd,String category) {
		toDoList.add(new ToDoList(toAdd,category));
		
	}

	public void delete(String name,String category) {
	   toDoList.remove(new ToDoList(name,category));
		
	}

}
