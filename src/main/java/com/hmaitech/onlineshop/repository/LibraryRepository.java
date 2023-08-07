package com.hmaitech.onlineshop.repository;

import com.hmaitech.onlineshop.model.dto.LibraryDto;
import com.hmaitech.onlineshop.model.entity.Library;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
@Qualifier("libraryRepository")
public interface LibraryRepository extends JpaRepository<Library, Long> {




}
