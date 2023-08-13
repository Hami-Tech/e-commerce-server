package com.hmaitech.onlineshop.controller;


import com.hmaitech.onlineshop.model.dto.CategoryDto;
import com.hmaitech.onlineshop.model.entity.CategoryEntity;
import com.hmaitech.onlineshop.service.CategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController extends BaseAbstractController<CategoryEntity, CategoryDto, CategoryService> {

}
