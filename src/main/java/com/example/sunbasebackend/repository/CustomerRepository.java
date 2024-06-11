package com.example.sunbasebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.sunbasebackend.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
