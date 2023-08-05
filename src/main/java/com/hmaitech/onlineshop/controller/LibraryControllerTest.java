package com.hmaitech.onlineshop.controller;



import com.hmaitech.onlineshop.model.dto.LibraryDto;
import com.hmaitech.onlineshop.service.LibraryService;
import com.hmaitech.onlineshop.service.LibraryServiceTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libtest")
public class LibraryControllerTest extends BasController<LibraryServiceTest, LibraryDto> {
//    protected LibraryControllerTest(LibraryServiceTest service) {
//        super(service);
//    }


}
