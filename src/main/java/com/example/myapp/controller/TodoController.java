package com.example.myapp.controller;

import com.example.myapp.client.TodoClient;
import com.example.myapp.client.TodoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/todos")
public class TodoController {

    private final TodoClient todoClient;

    @GetMapping
    public List<TodoDTO> getAll() {
        return todoClient.getAllTodos();
    }

    @GetMapping("/{id}")
    public TodoDTO getById(@PathVariable int id) {
        return todoClient.getTodoById(id);
    }
}
