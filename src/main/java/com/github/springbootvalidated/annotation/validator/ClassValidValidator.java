package com.github.springbootvalidated.annotation.validator;

import com.github.springbootvalidated.annotation.constraint.ClassValid;
import com.github.springbootvalidated.pojo.dto.ValidClassDTO;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 类级别的校验,更复杂的校验在这里做
 *
 * <p>
 * 创建时间为 下午6:20 2019/9/27
 * 项目名称 spring-boot-validated
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public class ClassValidValidator implements ConstraintValidator<ClassValid, ValidClassDTO> {

    @Override
    public boolean isValid(ValidClassDTO value, ConstraintValidatorContext context) {
        return StringUtils.equals(value.getPass1(), value.getPass2());
    }

}
