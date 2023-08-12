package com.hmaitech.onlineshop.model.mapper;

import com.hmaitech.onlineshop.model.dto.CategoryDto;
import com.hmaitech.onlineshop.model.entity.CategoryEntity;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CategoryMapper extends BaseAbstractMapper<CategoryEntity, CategoryDto> {

}
