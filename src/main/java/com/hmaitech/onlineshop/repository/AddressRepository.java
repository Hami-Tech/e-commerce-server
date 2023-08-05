package com.hmaitech.onlineshop.repository;

import com.hmaitech.onlineshop.model.entity.AddressEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("addressRepository")
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
}
