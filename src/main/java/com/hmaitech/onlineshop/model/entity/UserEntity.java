package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity(name = "userEntity")
@Table(name = "User")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity extends BaseEntity {

    private String name;

    private String family;

    @Transient
    private String fullName;

    @OneToMany
    private List<AddressEntity> addressEntities = new ArrayList<>();

    @OneToMany
    private List<OrderEntity> orderEntities = new ArrayList<>();


    private String email;

    private String mobileNumber;


}
