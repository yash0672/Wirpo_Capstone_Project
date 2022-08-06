package com.greatlearning.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.user;
import com.greatlearning.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	public void save(@RequestBody user u) {
		userService.save(u);
	}
	@GetMapping("/getAllUsers")
	public List<user> getUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/getUserById/{id}")
	public Optional<user> getUserById(@PathVariable("id") Long Id){
		return userService.findByUserId(Id);
	}
	@PutMapping("/updateUser")
	public void update(@RequestBody user u) {
		userService.update(u);
	}
	@GetMapping("/deleteAll")
	public void deleteAll()
	{
		userService.deleteAll();
	}
	
	@GetMapping("/deleteById/{id}")
	public void deletebyid(@PathVariable("id") Long Id) {
		userService.deleteById(Id);
	}
}
