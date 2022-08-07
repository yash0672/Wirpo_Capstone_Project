package com.greatlearning.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class user {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String address;
	private String role;
	
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	public user(Long id, String address, String role, String name, long phNumber, String email) {
		super();
		this.id = id;
		this.address = address;
		this.role = role;
		this.name = name;
		this.phNumber = phNumber;
		this.email = email;
	}
	private String name;
	private long phNumber;
	private String email;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(long phNumber) {
		this.phNumber = phNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
