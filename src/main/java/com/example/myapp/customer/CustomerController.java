package com.example.myapp.customer;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/customers")
class CustomerController {
  private final CustomerRepository repo;
  CustomerController(CustomerRepository repo) { this.repo = repo; }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  CustomerDTO create(@RequestBody @Valid CustomerDTO dto) {
    var saved = repo.save(new CustomerEntity(
      dto.id() != null ? dto.id() : UUID.randomUUID(),
      dto.name()
    ));
    return new CustomerDTO(saved.getId(), saved.getName());
  }

  @GetMapping("/{id}")
  CustomerDTO get(@PathVariable UUID id) {
    var e = repo.findById(id).orElseThrow(() -> new IllegalArgumentException("not found"));
    return new CustomerDTO(e.getId(), e.getName());
  }
}
