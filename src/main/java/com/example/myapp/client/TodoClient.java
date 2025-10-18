package com.example.myapp.client;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange("/todos")
public interface TodoClient {

    @GetExchange("/{id}")
    TodoDTO getTodoById(@PathVariable int id);

    @GetExchange
    List<TodoDTO> getAllTodos();
}
