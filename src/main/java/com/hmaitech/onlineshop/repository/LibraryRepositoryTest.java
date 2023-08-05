package com.hmaitech.onlineshop.repository;

import com.hmaitech.onlineshop.model.entity.Library;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("libraryRepository")
@EnableJpaRepositories
public interface LibraryRepositoryTest extends JpaRepository<Library, Long> {
}
