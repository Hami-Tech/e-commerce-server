package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.envers.Audited;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "categoryEntity")
@Table(name = "Category")
@NoArgsConstructor
@AllArgsConstructor
@Component
@Audited
@Getter
@Setter
public class CategoryEntity extends BaseEntity {

    private String name;


    @OneToOne
    private ProductEntity product;


    @OneToMany
    private List<SubCategoryEntity> subCategories = new ArrayList<>();


}
