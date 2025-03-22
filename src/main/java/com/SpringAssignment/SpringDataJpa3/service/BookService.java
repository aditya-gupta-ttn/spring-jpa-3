package com.SpringAssignment.SpringDataJpa3.service;

import com.SpringAssignment.SpringDataJpa3.models.Author;
import com.SpringAssignment.SpringDataJpa3.models.Book;
import com.SpringAssignment.SpringDataJpa3.repository.AuthorRepository;
import com.SpringAssignment.SpringDataJpa3.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public BookService(AuthorRepository authorRepository){
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public void deleteBook(long book_id){
        bookRepository.deleteById(book_id);
    }
}
