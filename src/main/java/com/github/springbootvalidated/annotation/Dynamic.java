package com.github.springbootvalidated.annotation;

import com.github.springbootvalidated.annotation.validator.DynamicValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * 创建时间为 12:47 2019-04-17
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
//指定注解的处理类
@Constraint(validatedBy = DynamicValidator.class)
public @interface Dynamic {

    String value() default "";

    String message() default "Dynamic 不存在";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
