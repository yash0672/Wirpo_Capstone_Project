package com.greatlearning.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

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
@DynamicUpdate
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
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public Date getCreationTime() {
		return CreationTime;
	}
	public void setCreationTime(Date creationTime) {
		CreationTime = creationTime;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getIconLink() {
		return iconLink;
	}
	public void setIconLink(String iconLink) {
		this.iconLink = iconLink;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public product(String category, Date creationTime, String description, String iconLink, String name,
			float price, int status, int stock, Date updateTime) {
		super();
		
		Category = category;
		CreationTime = creationTime;
		Description = description;
		this.iconLink = iconLink;
		this.name = name;
		this.price = price;
		this.status = status;
		this.stock = stock;
		this.updateTime = updateTime;
	}
	
}
