package com.hmaitech.onlineshop.controller;


import com.hmaitech.onlineshop.model.dto.ReceiptDto;
import com.hmaitech.onlineshop.service.ReceiptService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receipt")
public class ReceiptController extends BaseAbstractController<ReceiptDto, ReceiptService> {

}
