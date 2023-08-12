package com.hmaitech.onlineshop.model.mapper;

import com.hmaitech.onlineshop.model.dto.AddressDto;
import com.hmaitech.onlineshop.model.entity.AddressEntity;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class AddressMapper extends BaseAbstractMapper<AddressEntity, AddressDto> {

}
