package com.hmaitech.onlineshop.model.dto;



import com.hmaitech.onlineshop.model.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class UserDto extends BaseDto {
    private String name;
    private String family;

    private Role role;

    private String fullName;

//    @OneToMany
//    @ToString.Exclude
//    private List<AddressEntity> addressEntities = new ArrayList<>();
//
//    @OneToMany
//    @ToString.Exclude
//    private List<OrderEntity> orderEntities = new ArrayList<>();

    private String email;

    private String mobileNumber;






}
