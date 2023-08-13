package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.envers.Audited;
import org.springframework.stereotype.Component;

@Entity(name = "addressEntity")
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
@Audited
@Getter
@Setter
public class AddressEntity extends BaseEntity {

    @OneToOne
    private UserEntity userId;


    private String addressLine1;
    private String addressLine2;
    private String Country;
    private String city;

    private String zipcode;

}
