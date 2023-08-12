package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity(name = "productEntity")
@Table(name = "Product")
@NoArgsConstructor
@AllArgsConstructor
@Component
@Audited
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


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<PathEntity> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<PathEntity> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Boolean getBookmarked() {
        return isBookmarked;
    }

    public void setBookmarked(Boolean bookmarked) {
        isBookmarked = bookmarked;
    }

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }
}
