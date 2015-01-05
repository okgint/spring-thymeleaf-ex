package org.ogin.validator;

import org.ogin.model.Customer;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class CustomerValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Customer.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "status", "status.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "webSite", "webSite.required");
    }
}
