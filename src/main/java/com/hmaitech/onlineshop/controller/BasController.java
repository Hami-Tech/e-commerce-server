package com.hmaitech.onlineshop.controller;

import com.hmaitech.onlineshop.exceptions.ServiceException;
import com.hmaitech.onlineshop.service.BaseService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;


@RestController
@Component
public abstract class BasController<S extends BaseService<D>, D> {

    @Autowired
    public S service;

    @PostMapping("/save")
    public D save(@RequestBody D d) throws ServiceException {
        return service.save(d);
    }

    @GetMapping("/find")
    public D findById(@RequestParam Long id) throws ServiceException{
        return service.findById(id);
    }
}
