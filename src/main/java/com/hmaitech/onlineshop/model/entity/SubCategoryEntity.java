package com.hmaitech.onlineshop.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import org.springframework.stereotype.Component;

@Entity(name = "subCategoryEntity")
@Table(name = "subcategory")
@NoArgsConstructor
@AllArgsConstructor
@Component
@Audited
public class SubCategoryEntity extends BaseEntity {


    private String name;

    @ManyToOne
    private CategoryEntity categoryId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryEntity getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(CategoryEntity categoryId) {
        this.categoryId = categoryId;
    }
}
