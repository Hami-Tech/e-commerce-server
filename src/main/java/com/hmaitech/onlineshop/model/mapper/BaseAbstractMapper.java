package com.hmaitech.onlineshop.model.mapper;


import com.hmaitech.onlineshop.model.dto.LibraryDto;
import com.hmaitech.onlineshop.model.entity.BaseEntity;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public abstract class BaseAbstractMapper<E extends BaseEntity, D extends LibraryDto> implements BaseMapper<E, D> {

    @Autowired
    private D dto;

    @Autowired
    private E entity;

//    @Override
//    public E dtoToEntity(LibraryDto libraryDto) {
//        Library library = new Library();
//        BeanUtils.copyProperties(libraryDto, library);
//        return library;
//
//
//    }
//
//
//    public LibraryDto entityToDto(Library library) {
//
//        LibraryDto libraryDto = new LibraryDto();
//        BeanUtils.copyProperties(library, libraryDto);
//        return libraryDto;
//
//    }

    public E dtoToEntity(D dto) {
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }


    public D entityToDto(E entity) {

        BeanUtils.copyProperties(entity, dto);
        return dto;

    }


}
