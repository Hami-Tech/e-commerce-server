package com.hmaitech.onlineshop.model.mapper;

import com.hmaitech.onlineshop.model.dto.UserDto;
import com.hmaitech.onlineshop.model.entity.UserEntity;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserMapper extends BaseAbstractMapper<UserEntity, UserDto> {

}
