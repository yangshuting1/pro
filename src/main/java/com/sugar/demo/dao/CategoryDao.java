package com.sugar.demo.dao;

import com.sugar.demo.dto.CategoryDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryDao {

    //@Select("select * from category")
    List<CategoryDto> findCategory();
}
