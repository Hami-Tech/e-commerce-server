package com.hmaitech.onlineshop.controller;


import com.hmaitech.onlineshop.model.dto.PathDto;
import com.hmaitech.onlineshop.service.PathService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/path-place")
public class PathController extends BaseAbstractController<PathDto, PathService> {

}
