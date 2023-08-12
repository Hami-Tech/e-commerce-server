package com.hmaitech.onlineshop.service;

import com.hmaitech.onlineshop.model.dto.UserDto;
import com.hmaitech.onlineshop.model.entity.UserEntity;
import com.hmaitech.onlineshop.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseAbstractService<UserEntity, UserRepository, UserDto> {


}
