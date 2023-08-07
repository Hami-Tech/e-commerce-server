package com.hmaitech.onlineshop.model.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact extends BaseEntity {

    @NotNull(message = "Name is required")
    @Size(min = 3, max = 40, message = "name must be longer than 3 and less than 40 characters")
    private String name;

    private String address1;
    private String address2;
    private String address3;
    @Min(9) @Max(14)
    private String phoneNumber;
    private String email;


}
