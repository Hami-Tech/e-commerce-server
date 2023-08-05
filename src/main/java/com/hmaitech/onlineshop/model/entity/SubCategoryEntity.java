package com.hmaitech.onlineshop.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Entity(name = "subCategoryEntity")
@Table(name = "subcategory")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Component
public class SubCategoryEntity extends BaseEntity {


    private String name;

    @ManyToOne
    private CategoryEntity categoryId;


}
