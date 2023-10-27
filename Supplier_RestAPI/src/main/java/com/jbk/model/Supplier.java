package com.jbk.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.jbk.annotations.NumericSizeEqual;
import com.jbk.annotations.ValidateCountry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {
	@Min(1)
	private Long supplierId;

	@NotBlank
	@Pattern(regexp = "^[a-zA-Z ]+[a-zA-Z0-9]*$", message = "Supplier not valid")
	private String supplierName;
	
	@NotBlank
	@Pattern(regexp = "^[a-zA-Z]+[a-zA-Z0-9]*$", message = "City not valid")
	private String city;

	@NumericSizeEqual(value  = 6,message = "Invalid Size Of Postalcode, Size Should Be 6 Digit")
	private int postalCode;
	
	@ValidateCountry(message = "Invalid Country. Country Should Be India, Pakistan, China, Amerika")
	private String countryName;
	
	@Size(min = 10, max = 10, message = "Mobile Number Should Be 10 Digit")
	@Pattern(regexp = "^[0-9]+$", message = "Invalid Mobile Number")
	private String mobileNo;

	

}
