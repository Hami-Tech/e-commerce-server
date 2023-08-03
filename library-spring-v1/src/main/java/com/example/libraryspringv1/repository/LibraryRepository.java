package com.example.libraryspringv1.repository;

import com.example.libraryspringv1.model.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LibraryRepository extends JpaRepository<Library,Long> {
}
