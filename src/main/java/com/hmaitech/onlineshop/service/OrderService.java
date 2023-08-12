package com.hmaitech.onlineshop.service;

import com.hmaitech.onlineshop.model.dto.OrderDto;
import com.hmaitech.onlineshop.model.entity.OrderEntity;
import com.hmaitech.onlineshop.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends BaseAbstractService<OrderEntity, OrderRepository, OrderDto> {


}
