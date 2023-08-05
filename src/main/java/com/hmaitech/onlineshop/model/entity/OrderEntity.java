package com.hmaitech.onlineshop.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "orderEntity")
@Table(name = "Orders")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Component
public class OrderEntity extends BaseEntity {


    @OneToMany
    private List<ProductEntity> products=new ArrayList<>();

    @Column(columnDefinition = "Integer",length = 1)
    private Boolean status;



}
