package com.github.springbootvalidated.annotation;

import com.github.springbootvalidated.annotation.validator.GenderValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * 创建时间为 下午6:13 2019/9/27
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Constraint(validatedBy = GenderValidator.class)
public @interface Gender {

    String[] value();

    String message() default "AnnoValidator 不存在";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}
