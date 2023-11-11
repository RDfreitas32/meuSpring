package com.springproject.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
