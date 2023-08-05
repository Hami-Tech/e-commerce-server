package com.hmaitech.onlineshop.model.mapper;

import com.hmaitech.onlineshop.model.dto.LibraryDto;
import com.hmaitech.onlineshop.model.entity.Library;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component

public class LibraryMapper extends BaseAbstractMapper<Library, LibraryDto> {

//    @Override
//    public Library dtoToEntity(LibraryDto libraryDto) {
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
}
