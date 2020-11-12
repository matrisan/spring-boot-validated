package com.github.springbootvalidated.annotation.constraint;

import com.github.springbootvalidated.annotation.validator.ClassValidValidator;
import org.hibernate.validator.constraints.CompositionType;
import org.hibernate.validator.constraints.ConstraintComposition;
import org.hibernate.validator.constraints.Length;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.NotNull;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 石少东
 * @date 2020-11-12 22:52
 * @since 1.0
 */

@Length(min = 3, max = 5, message = "长度不正确")
@NotNull
@ConstraintComposition(CompositionType.AND)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Constraint(validatedBy = {})
//@ReportAsSingleViolation
public @interface Composition {

    String message() default "请输入正确的统一社会信用代码/工商注册登记号/身份证号码/护照号";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}
