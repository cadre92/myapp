package com.example.myapp.client;

import lombok.Data;

@Data
public class TodoDTO {
    private int id;
    private int userId;
    private String title;
    private boolean completed;
}
