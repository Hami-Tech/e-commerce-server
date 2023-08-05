package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity(name = "productEntity")
@Table(name = "Product")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Component
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
