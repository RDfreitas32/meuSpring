package com.springproject.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
