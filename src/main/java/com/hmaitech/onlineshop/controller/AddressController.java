package com.hmaitech.onlineshop.controller;


import com.hmaitech.onlineshop.model.dto.AddressDto;
import com.hmaitech.onlineshop.model.entity.AddressEntity;
import com.hmaitech.onlineshop.service.AddressService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController extends BaseAbstractController<AddressEntity,AddressDto, AddressService> {

}
