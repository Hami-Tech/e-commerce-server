package com.example.libraryspringv1.controller;

import com.example.libraryspringv1.model.dto.LibraryDto;
import com.example.libraryspringv1.service.BaseService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Component
public abstract class BasController<S extends BaseService<D>,D> {

    public final S service;

    protected BasController(S service) {
        this.service = service;
    }


    @PostMapping("/save")
    public D save(@RequestBody D d){
        return service.save(d);
    }

}
