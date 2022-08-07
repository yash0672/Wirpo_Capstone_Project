package com.greatlearning.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.NaturalId;

import lombok.Data;
@Entity
@Data
public class ProductCategory {
	  @Id
	    @GeneratedValue
	    private Integer categoryId;

	    private String categoryName;

	    @NaturalId
	    private Integer categoryType;

	    private Date createTime;

	    private Date updateTime;


}
