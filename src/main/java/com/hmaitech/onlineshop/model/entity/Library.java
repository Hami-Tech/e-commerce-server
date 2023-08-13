package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.envers.Audited;
import org.springframework.stereotype.Component;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
@Audited
@Getter
@Setter
public class Library extends BaseEntity {

    private String name;


}
