package com.hmaitech.onlineshop.repository;

import com.hmaitech.onlineshop.model.entity.CategoryEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("categoryRepository")
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
