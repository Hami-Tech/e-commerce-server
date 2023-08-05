package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity(name = "categoryEntity")
@Table(name = "Category")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class CategoryEntity extends BaseEntity {

    private String name;


    @OneToOne
    private ProductEntity product;


    @OneToMany
    private List<SubCategoryEntity> subCategories=new ArrayList<>();


}
