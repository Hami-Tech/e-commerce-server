//package com.hmaitech.onlineshop.controller;
//
//import com.hmaitech.onlineshop.exceptions.ServiceException;
//import com.hmaitech.onlineshop.model.entity.BaseEntity;
//import com.hmaitech.onlineshop.repository.BaseRepoTest;
//import com.hmaitech.onlineshop.service.BaseAbstractServiceTest;
//import com.hmaitech.onlineshop.service.BaseServiceTest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.*;
//
//
//@RestController
//@Component
//public abstract class BasControllerTest<S extends BaseAbstractServiceTest<E, D, R>, D, E extends BaseEntity, R extends BaseRepoTest<E,Long>> {
//
//    @Autowired
//    public S service;
//
//    @PostMapping("/save")
//    public D save(@RequestBody D d) throws ServiceException {
//        return service.save(d);
//    }
//
//    @GetMapping("/find")
//    public D findById(@RequestParam Long id) throws ServiceException {
//        return service.findById(id);
//    }
//}
