package com.jbk.validation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.jbk.model.Category;
import com.jbk.model.Product;
import com.jbk.model.Supplier;

@Component
public class ObjectValidation {
	
	@Autowired
	private RestTemplate restTemplate;

	public Map<String, String> validateProduct(Product product) {
		
		String productName=product.getProductName();
		long supplierId=product.getSupplierId();
		long categoryId=product.getCategoryId();
		int productQty=product.getProductQty();
		double productPrice=product.getProductPrice();
		
		Map<String, String> errorMap=new HashMap<>();
		
		if(productName==null || productName.trim().equals("")) {
			errorMap.put("Product Name", "Product Name Is Required");
		}
		
		if(supplierId<=0) {
			errorMap.put("Product Supplier", " Invalid Supplier Id");
		}else {
			Supplier supplier = restTemplate.getForObject("http://localhost:8093/supplier/get-supplier-by-id/"+supplierId, Supplier.class);
		
			if(supplier==null) {
				errorMap.put("Product Supplier", "Supplier Not Exists In Db With Id = "+supplierId);
			}
		}
		
		
		if(categoryId<=0) {
			errorMap.put("Product Category", " Invalid Category Id");
		}else {
			Category category = restTemplate.getForObject("http://localhost:8092/category/get-category-by-id/"+categoryId, Category.class);

			if(category==null) {
				errorMap.put("Product Category", "Category Not Exists In Db With Id = "+categoryId);
			}
		}
		
		if(productQty<=0) {
			errorMap.put("Product Qty", "Invalid Product Qty");
		}
		
		if(productPrice<=0) {
			errorMap.put("Product Price", "Invalid Product Price");
		}
		
		return null;

	}

}
