package org.ogin.validator;

import org.ogin.model.Customers2;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Jabrik on 08/11/2014.
 */
public class Customers2Validator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Customers2.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customers2 customers2 = (Customers2) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "firstName.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "lastName.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "gender.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "yearsOfBirth", "yearsOfBirth.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "streetAddress", "streetAddress.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "postalCode", "postalCode.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "city.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cityId", "cityId.required");
    }
}
