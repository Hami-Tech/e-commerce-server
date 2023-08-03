package com.hmaitech.onlineshop.service;

import com.hmaitech.onlineshop.model.dto.LibraryDto;
import com.hmaitech.onlineshop.model.entity.Library;
import com.hmaitech.onlineshop.model.mapper.LibraryMapper;
import com.hmaitech.onlineshop.repository.LibraryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LibraryService implements BaseService<LibraryDto> {


    private final LibraryRepository libraryRepository;

    private final LibraryMapper libraryMapper;


    public LibraryDto save(LibraryDto libraryDto) {
        Library library = libraryRepository.save(libraryMapper.dtoToEntity(libraryDto));

        return libraryMapper.entityToDto(library);
    }

}
