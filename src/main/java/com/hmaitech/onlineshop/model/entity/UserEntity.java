package com.hmaitech.onlineshop.model.entity;


import com.hmaitech.onlineshop.model.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.envers.Audited;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Entity(name = "userEntity")
@Table(name = "Users")
@NoArgsConstructor
@AllArgsConstructor
@Component
@Audited
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<AddressEntity> getAddressEntities() {
        return addressEntities;
    }

    public void setAddressEntities(List<AddressEntity> addressEntities) {
        this.addressEntities = addressEntities;
    }

    public List<OrderEntity> getOrderEntities() {
        return orderEntities;
    }

    public void setOrderEntities(List<OrderEntity> orderEntities) {
        this.orderEntities = orderEntities;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
