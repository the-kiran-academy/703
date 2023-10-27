package com.jbk.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NumericSizeValidator implements ConstraintValidator<NumericSizeEqual , Number>{

	private int targetSize;
	
	@Override
    public void initialize(NumericSizeEqual nse) {
        this.targetSize = nse.value();
    }

    @Override
    public boolean isValid(Number number, ConstraintValidatorContext context) {
               
       String value = number.toString();
        
        return value.length() == targetSize;
    }

}
