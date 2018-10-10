package com.sugar.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class ChildrenDto {

    private long id;
    private String name;
    private List<ChildrenDto> childrenList;
}
