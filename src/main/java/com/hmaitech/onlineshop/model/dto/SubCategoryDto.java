package com.hmaitech.onlineshop.model.dto;


import com.hmaitech.onlineshop.model.entity.CategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class SubCategoryDto extends BaseDto {

    private String name;
    @Autowired
    private CategoryEntity category;

   private Long categoryId;


}
