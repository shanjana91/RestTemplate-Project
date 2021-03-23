package com.steria.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//MODEL CLASS
// LOMBOK : install the jar in admin mode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {
	
	
	private int id;
	private String name;
	private int quantity;
	private int price;
	
}
	
	