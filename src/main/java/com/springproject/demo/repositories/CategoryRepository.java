package com.springproject.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
