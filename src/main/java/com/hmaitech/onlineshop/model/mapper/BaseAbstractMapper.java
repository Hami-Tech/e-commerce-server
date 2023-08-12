package com.hmaitech.onlineshop.model.mapper;


import com.hmaitech.onlineshop.model.dto.BaseDto;
import com.hmaitech.onlineshop.model.entity.BaseEntity;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public abstract class BaseAbstractMapper<E extends BaseEntity, D extends BaseDto> {

    @Autowired
    private D dto;

    @Autowired
    private E entity;

    public E dtoToEntity(D dto) {
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }


    public D entityToDto(E entity) {
        BeanUtils.copyProperties(entity, dto);
        return dto;

    }


}
