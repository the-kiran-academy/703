package com.jbk.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product_Supplier_Category {

	private Long productId;

	private String productName;

	private Integer productQty;
	private Double productPrice;
	
	private Supplier supplier;
	
	private Category category;
	
	

}
