package com.greatlearning.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class WishList {
	


@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;


@OneToOne(targetEntity = user.class, fetch = FetchType.EAGER)
@JoinColumn(nullable = false, name = "id")
private user User;


private Date createdDate;

@ManyToOne()
@JoinColumn(name = "id",insertable=false,updatable=false)
private product product;

}
