package com.example.libraryspringv1.model.entity;


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
    private Instant createDate;

    @LastModifiedDate
    private Instant updateDate;


    private Boolean deleted;



}
