package com.hmaitech.onlineshop.model.mapper;

import com.hmaitech.onlineshop.model.dto.ProductDto;
import com.hmaitech.onlineshop.model.entity.ProductEntity;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ProductMapper extends BaseAbstractMapper<ProductEntity, ProductDto> {

}
