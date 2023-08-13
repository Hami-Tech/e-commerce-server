package com.hmaitech.onlineshop.controller;

import com.hmaitech.onlineshop.model.dto.BaseDto;
import com.hmaitech.onlineshop.model.entity.BaseEntity;
import com.hmaitech.onlineshop.service.BaseAbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public abstract class BaseAbstractController<E extends BaseEntity, D extends BaseDto, S extends BaseAbstractService<E, ?, D>> {
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

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public D findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/find")
    public List<D> findAll() {
        return service.findAll();
    }

    @GetMapping("/find/{example}")
    public List<D> findByExample(@PathVariable E example) {
        return service.findByExample(example);
    }

}
