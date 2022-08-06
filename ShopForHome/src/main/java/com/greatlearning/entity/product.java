package com.greatlearning.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String Category;
	private Date CreationTime;
	private String Description;
	private String iconLink;
	private String name;
	private float price;
	private int status;
	private int stock;
	private Date updateTime;
	
}
