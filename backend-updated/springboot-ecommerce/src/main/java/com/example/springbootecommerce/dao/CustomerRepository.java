package com.example.springbootecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springbootecommerce.entity.Customer;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String theEmail);
}
