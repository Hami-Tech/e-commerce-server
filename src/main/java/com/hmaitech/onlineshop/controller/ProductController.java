package com.hmaitech.onlineshop.controller;


import com.hmaitech.onlineshop.model.dto.ProductDto;
import com.hmaitech.onlineshop.model.entity.ProductEntity;
import com.hmaitech.onlineshop.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController extends BaseAbstractController<ProductEntity, ProductDto, ProductService> {

}
