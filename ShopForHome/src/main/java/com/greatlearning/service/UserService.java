package com.greatlearning.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.entity.user;

public interface UserService {
	public void save(user u);
	public List<user> getAllUsers();
	public Optional<user> findByUserId(Long Id);
	public void update(user u);
	public void deleteAll();
	public void deleteById(long Id);
}
