package com.hmaitech.onlineshop.service;

import com.hmaitech.onlineshop.model.dto.BaseDto;
import com.hmaitech.onlineshop.model.entity.BaseEntity;
import com.hmaitech.onlineshop.model.mapper.BaseAbstractMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public abstract class BaseAbstractService<E extends BaseEntity, Repo extends JpaRepository<E, Long>, D extends BaseDto> {

    @Autowired
    private Repo repository;


    @Autowired
    private BaseAbstractMapper<E, D> mapper;

    @Transactional
    public D save(D dto) {

        E e = repository.save(mapper.dtoToEntity(dto));

        return mapper.entityToDto(e);
    }

    @Transactional
    public D update(D dto) {

        E e = repository.save(mapper.dtoToEntity(dto));

        return mapper.entityToDto(e);
    }
}
