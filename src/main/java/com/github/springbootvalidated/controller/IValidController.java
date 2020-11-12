package com.github.springbootvalidated.controller;

import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @author 石少东
 * @date 2020-11-12 10:50
 * @since 1.0
 */

@Validated
public interface IValidController<T> {

    T valid(@Valid T data);
}
