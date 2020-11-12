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
 * 创建时间为 13:39 2019-04-17
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */


@Constraint(validatedBy = CrossValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Documented
public @interface Cross {

    String message() default "{password.confirmation.error}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
