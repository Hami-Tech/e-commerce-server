package com.hmaitech.onlineshop.controller;


import com.hmaitech.onlineshop.model.dto.OrderDto;
import com.hmaitech.onlineshop.model.entity.OrderEntity;
import com.hmaitech.onlineshop.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController extends BaseAbstractController<OrderEntity, OrderDto, OrderService> {

}
