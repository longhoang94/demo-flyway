package com.example.demoflyway.repository;

import com.example.demoflyway.models.Customer;
import com.example.demoflyway.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

    Order findByCustomer(Customer customer);
}