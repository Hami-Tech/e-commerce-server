package com.hmaitech.onlineshop.service;

import com.hmaitech.onlineshop.model.dto.BaseDto;
import com.hmaitech.onlineshop.model.entity.BaseEntity;
import com.hmaitech.onlineshop.model.mapper.BaseAbstractMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(readOnly = true)
public abstract class BaseAbstractService<E extends BaseEntity, R extends JpaRepository<E, Long>, D extends BaseDto> {

    @Autowired
    private R repository;


    @Autowired
    private BaseAbstractMapper<E, D> mapper;

    @Transactional
    public D save(D dto) {

        E entity = repository.save(mapper.dtoToEntity(dto));

        return mapper.entityToDto(entity);
    }

    @Transactional
    public D update(D dto) {

        E entity = repository.save(mapper.dtoToEntity(dto));

        return mapper.entityToDto(entity);
    }

    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public D findById(Long id) {
        E e = repository.findById(id).get();
        return mapper.entityToDto(e);
    }

    public List<D> findAll() {
        List<E> entityList = repository.findAll();
        List<D> dtoList = new ArrayList<>();
        for (E e : entityList) {
            dtoList.add(mapper.entityToDto(e));
        }
        return dtoList;
    }

    public List<D> findByExample(E entity) {
        List<E> entityList = repository.findAll(Example.of(entity));
        List<D> dtoList = new ArrayList<>();
        for (E e : entityList) {
            dtoList.add(mapper.entityToDto(e));
        }
        return dtoList;
    }
}
