package com.hmaitech.onlineshop.controller;


import com.hmaitech.onlineshop.model.dto.UserDto;
import com.hmaitech.onlineshop.model.entity.UserEntity;
import com.hmaitech.onlineshop.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BaseAbstractController<UserEntity,UserDto, UserService> {

}
