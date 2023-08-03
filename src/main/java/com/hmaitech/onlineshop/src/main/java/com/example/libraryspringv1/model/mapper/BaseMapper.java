package com.example.libraryspringv1.model.mapper;

import com.example.libraryspringv1.model.dto.LibraryDto;
import com.example.libraryspringv1.model.entity.Library;
import org.springframework.beans.BeanUtils;

public interface BaseMapper<E,D> {

     E dtoToEntity(D dto);



     D entityToDto(E entity);


}
