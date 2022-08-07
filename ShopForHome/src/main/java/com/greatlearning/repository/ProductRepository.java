package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.entity.product;

public interface ProductRepository extends JpaRepository<product, Long> {
	public product findByName(String name);
	
}
