package com.sugar.demo.service.impl;

import com.sugar.demo.dao.CategoryDao;
import com.sugar.demo.dto.CategoryDto;
import com.sugar.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<CategoryDto> findCategory() {
        return categoryDao.findCategory();
    }
}
