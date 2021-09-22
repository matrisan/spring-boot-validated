package com.github.springbootvalidated.annotation.constraint;

import com.github.springbootvalidated.annotation.validator.CrossValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * create in 2021/5/13 5:56 下午
 *
 * @author shishaodong
 * @version 0.0.1
 */

@Constraint(validatedBy = CrossValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Documented
public @interface LegalPassword {

    String message() default "{password.confirmation.error}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
