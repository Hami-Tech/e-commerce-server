package com.example.libraryspringv1.service;


import org.springframework.stereotype.Service;

@Service
public interface BaseService <D>{

    D save(D dto);
}
