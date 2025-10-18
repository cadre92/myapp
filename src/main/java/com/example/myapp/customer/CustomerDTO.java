package com.example.myapp.customer;

import jakarta.validation.constraints.NotBlank;
import java.util.UUID;

public record CustomerDTO(UUID id, @NotBlank String name) {}
