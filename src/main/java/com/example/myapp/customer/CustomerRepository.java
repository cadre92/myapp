package com.example.myapp.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface CustomerRepository extends JpaRepository<CustomerEntity, UUID> {}
