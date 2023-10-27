package com.jbk.utility;

import org.springframework.stereotype.Component;
import com.jbk.entity.ProductEntity;
import com.jbk.model.Product;

@Component
public class EntityToModel {

	
	public Product convertToModel(ProductEntity entity) {
		Product product = new Product();

		product.setProductId(entity.getProductId());
		product.setProductName(entity.getProductName());
		product.setProductPrice(entity.getProductPrice());
		product.setProductQty(entity.getProductQty());

		product.setCategoryId(entity.getCategoryId());
		product.setSupplierId(entity.getSupplierId());

		return product;
	}

}
