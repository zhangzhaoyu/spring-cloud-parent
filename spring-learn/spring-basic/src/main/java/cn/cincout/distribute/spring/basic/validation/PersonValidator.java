package cn.cincout.distribute.spring.basic.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by zhaoyu on 18-8-10.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class PersonValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
        Person person = (Person) target;

        if (person.getAge() < 0) {
            errors.rejectValue("age", "negativevalue");
        }
        else if (person.getAge() > 110) {
            errors.rejectValue("age", "too.darn.old");
        }
    }
}
