package com.hmaitech.onlineshop.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity(name = "orderEntity")
@Table(name = "Orders")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class OrderEntity extends BaseEntity {


    @OneToMany
    private List<ProductEntity> products=new ArrayList<>();

    @Column(columnDefinition = "Integer",length = 1)
    private Boolean status;



}
