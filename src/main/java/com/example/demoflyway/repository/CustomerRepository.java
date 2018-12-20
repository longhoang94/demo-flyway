package com.example.demoflyway.repository;

import com.example.demoflyway.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer findByName(String name);

}
