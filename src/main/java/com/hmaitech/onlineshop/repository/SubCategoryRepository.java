package com.hmaitech.onlineshop.repository;

import com.hmaitech.onlineshop.model.entity.SubCategoryEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("subCategoryRepository")
public interface SubCategoryRepository extends JpaRepository<SubCategoryEntity, Long> {
}
