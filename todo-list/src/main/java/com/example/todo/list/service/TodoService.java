package com.example.todo.list.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.list.model.Todo;
import com.example.todo.list.repository.TodoRepository;

@Service
public class TodoService {

	private TodoRepository todoRepository;
	
	@Autowired
	public TodoService(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}
	
	public Todo saveTodo(Todo todo) {
		return this.todoRepository.save(todo);
	}
	
	public List<Todo> todos() {
		return this.todoRepository.findAll();
	}
	
}
