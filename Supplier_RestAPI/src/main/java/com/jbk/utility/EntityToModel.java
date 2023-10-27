package com.jbk.utility;

import org.springframework.stereotype.Component;
import com.jbk.entity.SupplierEntity;
import com.jbk.model.Supplier;

@Component
public class EntityToModel {

	
	public Supplier convertToModel(SupplierEntity entity) {
		Supplier supplier = new Supplier();
		

		supplier.setSupplierId(entity.getSupplierId());
		supplier.setSupplierName(entity.getSupplierName());
		supplier.setPostalCode(entity.getPostalCode());
		supplier.setMobileNo(entity.getMobileNo());
		supplier.setCountryName(entity.getCountryName());
		supplier.setCity(entity.getCity());

		return supplier;

	}

	
}
