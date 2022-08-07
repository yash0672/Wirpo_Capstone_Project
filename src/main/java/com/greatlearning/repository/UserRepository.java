package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.entity.user;

public interface UserRepository extends JpaRepository<user,Long> {
	user findByEmail(String email);
}
