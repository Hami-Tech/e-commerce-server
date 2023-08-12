package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import org.springframework.stereotype.Component;

@Entity(name = "receiptEntity")
@Table(name = "Receipt")
@NoArgsConstructor
@AllArgsConstructor

@Component
@Audited
public class ReceiptEntity extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
