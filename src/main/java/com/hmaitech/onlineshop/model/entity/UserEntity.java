package com.hmaitech.onlineshop.model.entity;


import com.hmaitech.onlineshop.model.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Entity(name = "userEntity")
@Table(name = "Users")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
public class UserEntity extends BaseEntity {


    @Column(name = "FIRST_NAME", length = 50)
    private String name;
    @Column(name = "LAST_NAME", length = 50)
    private String family;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Transient
    private String fullName;

    @OneToMany
    @ToString.Exclude
    private List<AddressEntity> addressEntities = new ArrayList<>();

    @OneToMany
    @ToString.Exclude
    private List<OrderEntity> orderEntities = new ArrayList<>();


    private String email;

    private String mobileNumber;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = this.name + " " + this.family;
    }
}
