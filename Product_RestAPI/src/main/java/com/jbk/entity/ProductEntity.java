package com.jbk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.jbk.model.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class ProductEntity {
	
	@Id
	@Column(unique = true,nullable = false )
	private Long productId;
	
	@Column(unique = true,nullable = false)
	private String productName;
	
	@Column(nullable = false )
	private long supplierId;
	
	@Column(nullable = false )
	private long categoryId;
	
	@Column(nullable = false)
	private Integer productQty;
	
	@Column(nullable = false)
	private Double productPrice;
	
	

}
