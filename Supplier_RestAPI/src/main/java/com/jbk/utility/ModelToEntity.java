package com.jbk.utility;

import org.springframework.stereotype.Component;
import com.jbk.entity.SupplierEntity;
import com.jbk.model.Supplier;

@Component
public class ModelToEntity {

	public SupplierEntity convertToEntity(Supplier supplier) {
		SupplierEntity entity = new SupplierEntity();

		entity.setSupplierId(supplier.getSupplierId());
		entity.setSupplierName(supplier.getSupplierName());
		entity.setPostalCode(supplier.getPostalCode());
		entity.setMobileNo(supplier.getMobileNo());
		entity.setCountryName(supplier.getCountryName());
		entity.setCity(supplier.getCity());

		return entity;

	}

	}
