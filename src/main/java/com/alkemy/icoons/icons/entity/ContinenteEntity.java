package com.alkemy.icoons.icons.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "continente")
@Getter
@Setter
public class ContinenteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )	
	private Long id;
	
	private String image;
	
	private String denomination;
}
