package com.hmaitech.onlineshop.model.dto;


import com.hmaitech.onlineshop.model.entity.CategoryEntity;
import com.hmaitech.onlineshop.model.entity.PathEntity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ProductDto extends BaseDto {


    private String title;
    private String Description;

    private Double Price;
    private Integer Quantity;
    private Boolean isBookmarked;

   @Autowired
    private CategoryEntity categoryEntity;


}
