package com.example.todo.list.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.list.model.Todo;
import com.example.todo.list.service.TodoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path = "${application.rest.todo.list}")
@SuppressWarnings("rawtypes")
public class TodoListController {

	private TodoService todoService;
	
	@Autowired
	public TodoListController(TodoService todoService) {
		this.todoService = todoService;
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity addTodo(@RequestBody Todo todo) {
		log.info("New todo: {}", todo);
		todo = this.todoService.saveTodo(todo);
		return ResponseEntity.status(HttpStatus.CREATED).body(todo);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getAllTodos() {
		log.info("Getting all todos");
		return ResponseEntity.status(HttpStatus.OK).body(this.todoService.todos());
	}
	
}
