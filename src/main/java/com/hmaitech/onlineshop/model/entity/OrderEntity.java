package com.hmaitech.onlineshop.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.envers.Audited;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Entity(name = "orderEntity")
//@Table(name = "Ordersss")
//@NoArgsConstructor
//@AllArgsConstructor
//@Component
//@Audited(targetAuditMode = RelationTargetAuditMode.AUDITED)
//@EntityListeners(AuditingEntityListener.class)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
@Audited
public class OrderEntity extends BaseEntity {


    @OneToMany
    private List<ProductEntity> products = new ArrayList<>();

    @Column(columnDefinition = "Integer", length = 1)
    private Boolean status;

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
