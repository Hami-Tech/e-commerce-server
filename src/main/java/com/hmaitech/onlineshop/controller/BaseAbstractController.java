package com.hmaitech.onlineshop.controller;

import com.hmaitech.onlineshop.model.entity.BaseEntity;
import com.hmaitech.onlineshop.service.BaseAbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Component
public abstract class BaseAbstractController<E extends BaseEntity, D, R extends JpaRepository<E, Long>, S extends BaseAbstractService<E, D, R>> {
    @Autowired
    public S service;


    @PostMapping("/save")
    public D save(@RequestBody D d) {
        return service.save(d);
    }

}
