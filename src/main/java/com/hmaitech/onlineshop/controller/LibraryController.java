package com.hmaitech.onlineshop.controller;


import com.hmaitech.onlineshop.model.dto.LibraryDto;
import com.hmaitech.onlineshop.service.LibraryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libraries")
public class LibraryController extends BasController<LibraryService, LibraryDto> {
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
