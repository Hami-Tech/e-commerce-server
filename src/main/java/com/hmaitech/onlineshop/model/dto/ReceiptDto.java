package com.hmaitech.onlineshop.model.dto;


import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ReceiptDto extends BaseDto {

    private String name;

}
