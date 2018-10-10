package com.sugar.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class CategoryDto {
    private long id;
    private String name;
    private long superCategoryId;
    private List<CategoryDto> children;
}
