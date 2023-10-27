package com.jbk.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

@Retention(RUNTIME)
@Target({ FIELD, METHOD, PARAMETER })
@Constraint(validatedBy = NumericSizeValidator.class)

public @interface NumericSizeEqual  {

	public int value() ;
	public String message() default "Invalid Postal Code";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
