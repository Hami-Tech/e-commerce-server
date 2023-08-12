package com.hmaitech.onlineshop.service;

import com.hmaitech.onlineshop.model.dto.CategoryDto;
import com.hmaitech.onlineshop.model.entity.CategoryEntity;
import com.hmaitech.onlineshop.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends BaseAbstractService<CategoryEntity, CategoryRepository, CategoryDto> {


}
