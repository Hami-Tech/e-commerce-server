package com.hmaitech.onlineshop.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity(name = "subCategoryEntity")
@Table(name = "subcategory")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class SubCategoryEntity extends BaseEntity {


    private String name;

    @ManyToOne
    private CategoryEntity categoryId;


}
