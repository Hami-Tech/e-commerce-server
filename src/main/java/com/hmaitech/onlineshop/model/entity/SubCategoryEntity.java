package com.hmaitech.onlineshop.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;
import org.springframework.stereotype.Component;

@Entity(name = "subCategoryEntity")
@Table(name = "subcategory")
@NoArgsConstructor
@AllArgsConstructor
@Component
@Audited
@Getter
@Setter
public class SubCategoryEntity extends BaseEntity {


    private String name;

    @ManyToOne
    private CategoryEntity categoryId;


}
