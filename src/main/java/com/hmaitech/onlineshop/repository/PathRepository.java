package com.hmaitech.onlineshop.repository;

import com.hmaitech.onlineshop.model.entity.PathEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("pathRepository")
public interface PathRepository extends JpaRepository<PathEntity, Long> {
}
