package com.greatlearning.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.product;
import com.greatlearning.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@PostMapping("/save")
	public void save(@RequestBody product p) {
		productService.save(p);
	}
	
	@GetMapping("/getProducts")
	public List<product> getProducts(){
		return productService.findAll();
	}
	
	@GetMapping("/getProductById/{id}")
	public Optional<product> getProductById(@PathVariable("id") Long Id){
		return productService.findById(Id);
	}
	@GetMapping("/getProductByCategory/{category}")
	public List<product> getByCategory(@PathVariable("category") String Category){
		return productService.findByCategory(Category);
	}
	@PutMapping("/updateProduct")
	public void updateProduct(@RequestBody product p) {
		productService.update(p);
	}
	
	@GetMapping("/deleteAll")
	public void deleteALl(){
		productService.deleteAll();
	}
	
	@GetMapping("/deleteById/{id}")
	public void deletebyId(@PathVariable("id") Long Id) {
		productService.deleteById(Id);
	}

}
