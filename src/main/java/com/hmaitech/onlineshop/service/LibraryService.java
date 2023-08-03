package com.hmaitech.onlineshop.service;

import com.hmaitech.onlineshop.model.dto.LibraryDto;
import com.hmaitech.onlineshop.model.entity.Library;
import com.hmaitech.onlineshop.model.mapper.LibraryMapper;
import com.hmaitech.onlineshop.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
////@AllArgsConstructor
//@Singular
public class LibraryService implements BaseService<LibraryDto> {


    private static LibraryService instance;

    private LibraryService() {
    }

    public static LibraryService getInstance() {
        if (instance == null) {
            instance = new LibraryService();
            return instance;
        }
        return instance;
    }


    @Autowired
    private LibraryRepository libraryRepository;


    @Autowired
    private LibraryMapper libraryMapper;


    public LibraryDto save(LibraryDto libraryDto) {
        Library library = libraryRepository.save(libraryMapper.dtoToEntity(libraryDto));

        return libraryMapper.entityToDto(library);
    }

}
