package com.greatlearning.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.entity.product;

public interface ProductService {
	public void save(product p);
	public List<product> findAll();
	public Optional<product> findById(Long Id);
	public List<product> findByCategory(String category);
	public void update(product p);
	public void deleteAll();
	public void deleteById(Long Id);
}
