package com.example.todo.list.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.todo.list.model.Todo;

@Repository
public interface TodoRepository extends MongoRepository<Todo, Long> {

}
