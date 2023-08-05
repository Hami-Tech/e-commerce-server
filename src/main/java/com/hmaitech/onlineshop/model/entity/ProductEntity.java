package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.Objects;

@Entity(name = "productEntity")
@Table(name = "Product")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ProductEntity extends BaseEntity {

    private String title;
    private String Description;

    @OneToMany
    private List<PathEntity> imageUrls;

    private Double Price;
    private Integer Quantity;
    private Boolean isBookmarked;

    @OneToOne
    private CategoryEntity categoryEntity;


}
