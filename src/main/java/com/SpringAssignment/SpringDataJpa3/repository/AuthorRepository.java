package com.SpringAssignment.SpringDataJpa3.repository;

import com.SpringAssignment.SpringDataJpa3.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
