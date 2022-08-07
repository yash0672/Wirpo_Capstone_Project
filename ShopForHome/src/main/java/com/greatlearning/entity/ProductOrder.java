package com.greatlearning.entity;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@DynamicUpdate
public class ProductOrder {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long Id;

	    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)

	    @JsonIgnore
	    private Cart cart;

	    @ManyToOne(fetch = FetchType.LAZY)
//	    @JoinColumn(name = "orderId")
	    @JsonIgnore
	    private Order order;
	    private String productId;
	    private String productName;
	    private String productDescription;
	    private String productIcon;	
	    private Integer categoryType;
	    private BigDecimal productPrice;
	    private Integer productStock;
	    private Integer count;   

}

