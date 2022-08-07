package com.greatlearning.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.Data;

@Entity
@Data
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cardId;
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JsonIgnore
	private user User;
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true,
            mappedBy = "cart")
    private Set<ProductOrder> products = new HashSet<>();

	

}
