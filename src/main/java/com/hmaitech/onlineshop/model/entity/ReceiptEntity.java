package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Entity(name = "receiptEntity")
@Table(name = "Receipt")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Component
public class ReceiptEntity extends BaseEntity{

    private String name;

}
