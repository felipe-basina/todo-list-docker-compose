package com.example.todo.list.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Document
@Data
@Builder
public class Todo {

	@Id
	private String id;
	
	private String descricao;
	
	private String status;
	
	private LocalDate date = LocalDate.now();
	
	private LocalDateTime creationDate = LocalDateTime.now();
	
	private LocalDateTime updateDate = LocalDateTime.now();
	
}
