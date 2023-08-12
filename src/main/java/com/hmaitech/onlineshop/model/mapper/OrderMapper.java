package com.hmaitech.onlineshop.model.mapper;

import com.hmaitech.onlineshop.model.dto.OrderDto;
import com.hmaitech.onlineshop.model.entity.OrderEntity;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class OrderMapper extends BaseAbstractMapper<OrderEntity, OrderDto> {

}
