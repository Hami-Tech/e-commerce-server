package com.hmaitech.onlineshop.model.mapper;

import com.hmaitech.onlineshop.model.dto.LibraryDto;
import com.hmaitech.onlineshop.model.entity.Library;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class LibraryMapper extends BaseAbstractMapper<Library, LibraryDto> {

}
