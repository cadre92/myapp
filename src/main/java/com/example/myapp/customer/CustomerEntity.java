package com.example.myapp.customer;

import jakarta.persistence.*;
import java.util.UUID;

@Entity @Table(name = "customer")
public class CustomerEntity {
    @Id private UUID id;
    @Column(nullable = false) private String name;

    protected CustomerEntity() {}
    public CustomerEntity(UUID id, String name) { this.id = id; this.name = name; }

    public UUID getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
