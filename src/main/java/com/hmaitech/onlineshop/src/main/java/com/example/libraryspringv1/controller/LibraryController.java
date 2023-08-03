package com.example.libraryspringv1.controller;


import com.example.libraryspringv1.model.dto.LibraryDto;
import com.example.libraryspringv1.model.entity.Library;
import com.example.libraryspringv1.service.LibraryService;
import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libraries")
public class LibraryController extends BasController<LibraryService,LibraryDto>{
    protected LibraryController(LibraryService service) {
        super(service);
    }

//    public final LibraryService libraryService;
//
//
//
//    @PostMapping("/save")
//    public LibraryDto save(@RequestBody LibraryDto libraryDto){
//        return libraryService.save(libraryDto);
//    }


}
