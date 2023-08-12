package com.hmaitech.onlineshop.service;

import com.hmaitech.onlineshop.model.dto.ProductDto;
import com.hmaitech.onlineshop.model.entity.ProductEntity;
import com.hmaitech.onlineshop.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends BaseAbstractService<ProductEntity, ProductRepository, ProductDto> {


}
