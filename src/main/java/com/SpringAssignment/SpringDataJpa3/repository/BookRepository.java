package com.SpringAssignment.SpringDataJpa3.repository;

import com.SpringAssignment.SpringDataJpa3.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
