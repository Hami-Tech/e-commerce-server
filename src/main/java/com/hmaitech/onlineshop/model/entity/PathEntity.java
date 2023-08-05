package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity(name = "pathEntity")
@Table(name = "Path")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class PathEntity extends BaseEntity{

    private String path;


}
