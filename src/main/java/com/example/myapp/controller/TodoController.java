package com.example.myapp.controller;

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
