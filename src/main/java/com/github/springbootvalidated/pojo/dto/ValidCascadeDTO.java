package com.github.springbootvalidated.pojo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

/**
 * @author 石少东
 * @date 2020-11-12 10:48
 * @since 1.0
 */

@Getter
@Setter
@Builder
@ToString
public class ValidCascadeDTO implements Serializable {

    private static final long serialVersionUID = 7876298268755281688L;

    private String username;

    private Set<@Valid ValidBasicDTO> set;

    @Valid
    private Book book;

    static class Book {

        @Size(min = 1, max = 4)
        private Set<String> catalogs;

        @Min(value = 10, message = "price不能小于 10")
        private Integer price;

    }

}
