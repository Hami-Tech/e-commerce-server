package com.hmaitech.onlineshop.controller;

import com.hmaitech.onlineshop.model.dto.BaseDto;
import com.hmaitech.onlineshop.service.BaseAbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public abstract class BaseAbstractController<D extends BaseDto, S extends BaseAbstractService<?, ?, D>> {
    @Autowired
    public S service;


    @PostMapping("/save")
    public D save(@RequestBody D d) {
        return service.save(d);
    }

    @PutMapping("/update")
    public D update(@RequestBody D d) {
        return service.update(d);
    }

}
