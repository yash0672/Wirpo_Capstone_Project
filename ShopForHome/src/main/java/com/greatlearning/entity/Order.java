package com.greatlearning.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;


@Entity
@Data
@DynamicUpdate

public class Order {
	 @Id
	   
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long orderId;

	    @OneToMany(cascade = CascadeType.ALL,
	            fetch = FetchType.LAZY,
	            mappedBy = "order")
	    private Set<ProductOrder> products = new HashSet<>();
	    private String buyerEmail;
	    private String buyerName;
	    private String buyerPhone;
	    private String buyerAddress;
	    private BigDecimal orderAmount;
	    private Integer orderStatus;
	    @CreationTimestamp
	    private LocalDateTime createTime;
	    @UpdateTimestamp
	    private LocalDateTime updateTime;


}
