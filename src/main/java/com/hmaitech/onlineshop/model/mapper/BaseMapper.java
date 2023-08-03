package com.hmaitech.onlineshop.model.mapper;

public interface BaseMapper<E, D> {

    E dtoToEntity(D dto);


    D entityToDto(E entity);


}
