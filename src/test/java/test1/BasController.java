//package com.hmaitech.onlineshop.controller;
//
//import com.hmaitech.onlineshop.service.BaseService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@Component
//public abstract class BasController<S extends BaseService<D>, D> {
//    @Autowired
//    public S service;
//
////    protected BasController(S service) {
////        this.service = service;
////    }
//
//
//    @PostMapping("/save")
//    public D save(@RequestBody D d) {
//        return service.save(d);
//    }
//
//}
