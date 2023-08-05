package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Entity(name = "pathEntity")
@Table(name = "Path")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Component
public class PathEntity extends BaseEntity{

    private String path;


}
