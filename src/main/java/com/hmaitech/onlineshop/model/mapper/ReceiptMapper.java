package com.hmaitech.onlineshop.model.mapper;

import com.hmaitech.onlineshop.model.dto.ReceiptDto;
import com.hmaitech.onlineshop.model.entity.ReceiptEntity;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ReceiptMapper extends BaseAbstractMapper<ReceiptEntity, ReceiptDto> {

}
