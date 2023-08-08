//package com.hmaitech.onlineshop.service;
//
//import com.hmaitech.onlineshop.model.entity.BaseEntity;
//import com.hmaitech.onlineshop.model.mapper.BaseMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public class BaseAbstractService<E extends BaseEntity, D, Repo extends JpaRepository<E, Long>> implements BaseService<D> {
////    @Override
////    public D save(D dto) {
////        return null;
////    }
//
//    @Autowired
//    private Repo repository;
//
//    @Autowired
//    private D dto;
//
//
//    @Autowired
//    private BaseMapper<E, D> mapper;
//
//    @Autowired
//    private E e;
//
//
//    public D save(D dto) {
//
//        e = repository.save(mapper.dtoToEntity(dto));
//
//        return mapper.entityToDto(e);
//    }
//}
