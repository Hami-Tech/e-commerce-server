package com.hmaitech.onlineshop.model.dto;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class AddressDto extends BaseDto {


    private String addressLine1;
    private String addressLine2;
    private String Country;
    private String city;

    private String zipcode;
}
