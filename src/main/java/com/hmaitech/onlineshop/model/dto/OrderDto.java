package com.hmaitech.onlineshop.model.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
//@AllArgsConstructor
@Component
public class OrderDto extends BaseDto {


    private String name;


}
