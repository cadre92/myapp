package com.example.myapp.client;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("/todos")
public interface TodoClient {

    @GetExchange("/{id}")
    TodoDTO getTodoById(@PathVariable int id);

    @GetExchange
    List<TodoDTO> getAllTodos();
}
