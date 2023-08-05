package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity(name = "receiptEntity")
@Table(name = "Receipt")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ReceiptEntity extends BaseEntity{

    private String name;

}
