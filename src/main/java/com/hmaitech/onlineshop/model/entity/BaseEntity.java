package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;


@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@Builder
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @CreatedDate
    @Column(updatable = false)
    private final Instant createDate = Instant.now();

    @LastModifiedDate
    private Instant updateDate = Instant.now();


    @Column(columnDefinition = "integer", length = 1)
    private Boolean deleted = false;


    @Version
    private Integer version;


}
