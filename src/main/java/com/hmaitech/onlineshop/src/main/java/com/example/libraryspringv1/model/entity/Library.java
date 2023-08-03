package com.example.libraryspringv1.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Library extends BaseEntity{

    private String name;



}
