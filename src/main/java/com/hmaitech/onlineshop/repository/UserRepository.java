package com.hmaitech.onlineshop.repository;

import com.hmaitech.onlineshop.model.entity.UserEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("userRepository")
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
