package com.jbk.utility;

import org.springframework.stereotype.Component;
import com.jbk.entity.ProductEntity;
import com.jbk.model.Product;

@Component
public class ModelToEntity {

	

	public ProductEntity convertToEntity(Product product) {
		ProductEntity entity = new ProductEntity();

		entity.setProductId(product.getProductId());
		entity.setProductName(product.getProductName());
		entity.setProductPrice(product.getProductPrice());
		entity.setProductQty(product.getProductQty());

		entity.setCategoryId(product.getCategoryId());
		entity.setSupplierId(product.getSupplierId());

		return entity;

	}
}
