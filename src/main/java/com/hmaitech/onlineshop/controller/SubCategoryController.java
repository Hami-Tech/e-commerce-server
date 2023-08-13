package com.hmaitech.onlineshop.controller;


import com.hmaitech.onlineshop.model.dto.SubCategoryDto;
import com.hmaitech.onlineshop.model.entity.SubCategoryEntity;
import com.hmaitech.onlineshop.service.SubCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sub-category")
public class SubCategoryController extends BaseAbstractController<SubCategoryEntity, SubCategoryDto, SubCategoryService> {

}
