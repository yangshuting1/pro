package com.sugar.demo.web;

import com.sugar.demo.common.ErrorCode;
import com.sugar.demo.common.Result;
import com.sugar.demo.dto.CategoryDto;
import com.sugar.demo.entity.Category;
import com.sugar.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @RequestMapping(value = "", method = RequestMethod.GET)
    public Result findCategory() {
        List<CategoryDto> categoryList = categoryService.findCategory();
        return new Result.Builder<List<CategoryDto>>().setCode(ErrorCode.SUCCESS).setData(categoryList).build();
    }
}
