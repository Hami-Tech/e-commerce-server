//package com.hmaitech.onlineshop.service;
//
//
//import com.hmaitech.onlineshop.model.mapper.BaseMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Service;
//
//@Service
//@Primary
//public class BaseAbstractService<Dto, Entity, Repo extends JpaRepository<Entity, Long>, Mapper extends BaseMapper<Entity, Dto>> {
//
//    @Autowired
//    private Repo repository;
//
//
//    @Autowired
//    private Mapper mapper;
//
//    @Autowired
//    private Entity entity;
//
//    public Dto save(Dto dto) {
//
//        entity = repository.save(mapper.dtoToEntity(dto));
//
//        return mapper.entityToDto(entity);
//    }
//
//
//}
