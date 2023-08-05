package com.hmaitech.onlineshop.repository;

import com.hmaitech.onlineshop.model.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("productRepository")
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
