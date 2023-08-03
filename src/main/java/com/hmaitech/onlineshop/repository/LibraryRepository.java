package com.hmaitech.onlineshop.repository;

import com.hmaitech.onlineshop.model.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {
}
