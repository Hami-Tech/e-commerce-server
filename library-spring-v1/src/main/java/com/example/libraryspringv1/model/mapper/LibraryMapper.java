package com.example.libraryspringv1.model.mapper;

import com.example.libraryspringv1.model.dto.LibraryDto;
import com.example.libraryspringv1.model.entity.Library;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Data
@Component
public class LibraryMapper implements BaseMapper<Library, LibraryDto> {

    @Override
    public Library dtoToEntity(LibraryDto libraryDto) {
        Library library = new Library();
        BeanUtils.copyProperties(libraryDto, library);
        return library;


    }


    public LibraryDto entityToDto(Library library) {

        LibraryDto libraryDto = new LibraryDto();
        BeanUtils.copyProperties(library, libraryDto);
        return libraryDto;

    }
}
