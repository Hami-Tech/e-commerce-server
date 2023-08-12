package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import org.springframework.stereotype.Component;

@Entity(name = "pathEntity")
@Table(name = "Path")
@NoArgsConstructor
@AllArgsConstructor
@Component
@Audited
public class PathEntity extends BaseEntity {

    private String path;


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
