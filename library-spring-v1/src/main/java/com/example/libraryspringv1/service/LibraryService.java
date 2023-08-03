package com.example.libraryspringv1.service;


import com.example.libraryspringv1.model.dto.LibraryDto;
import com.example.libraryspringv1.model.entity.Library;
import com.example.libraryspringv1.model.mapper.LibraryMapper;
import com.example.libraryspringv1.repository.LibraryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LibraryService implements BaseService<LibraryDto>{


    private final LibraryRepository libraryRepository;

    private final LibraryMapper libraryMapper;


    public LibraryDto save(LibraryDto libraryDto) {
     Library library = libraryRepository.save(libraryMapper.dtoToEntity(libraryDto));

        return libraryMapper.entityToDto(library);
    }

}
