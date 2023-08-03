package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;


@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@Builder
public class BaseEntity {

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
