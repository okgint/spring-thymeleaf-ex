package org.ogin.validator;

import org.ogin.model.Supplier;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class SupplierValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Supplier.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "webSite", "status.required");
      ;
    }
}
