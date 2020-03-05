package com.example.todo.list.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Document
@Data
@Builder
public class Todo {

	private Long id;
	
	private String descricao;
	
	private String status;
	
	private LocalDate date;
	
	private LocalDateTime creationDate;
	
	private LocalDateTime updateDate;
	
}
