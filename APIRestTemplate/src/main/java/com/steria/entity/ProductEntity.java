package com.steria.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

	@Getter
	@Setter
	private int id;
	@Getter
	@Setter
	private String pname;
	@Getter
	@Setter
	private int pquantity;
	@Getter
	@Setter
	private int pprice;
}
