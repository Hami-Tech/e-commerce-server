package com.hmaitech.onlineshop.service;

import com.hmaitech.onlineshop.model.entity.BaseEntity;
import com.hmaitech.onlineshop.model.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class BaseAbstractService<E extends BaseEntity, D, R extends JpaRepository<E, Long>> implements BaseService<D> {
//    @Override
//    public D save(D dto) {
//        return null;
//    }

    @Autowired
    private R repository;

    @Autowired
    private D dto;


    @Autowired
    private BaseMapper<E, D> mapper;

    @Autowired
    private E e;


    @Override
    public D save(D dto) {

        e = repository.save(mapper.dtoToEntity(dto));

        return mapper.entityToDto(e);
    }
    @Override
    public D findById(Long id) {

        e= repository.getReferenceById(id);
        return mapper.entityToDto(e);
    }
}
