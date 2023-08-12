package com.hmaitech.onlineshop.model.mapper;

import com.hmaitech.onlineshop.model.dto.SubCategoryDto;
import com.hmaitech.onlineshop.model.entity.SubCategoryEntity;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class SubCategoryMapper extends BaseAbstractMapper<SubCategoryEntity, SubCategoryDto> {

}
