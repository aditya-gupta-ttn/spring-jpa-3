package com.SpringAssignment.SpringDataJpa3.controllers;

import com.SpringAssignment.SpringDataJpa3.models.Book;
import com.SpringAssignment.SpringDataJpa3.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping("/add")
    public Book addAuthor(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/all")
    List<Book> getAuthors(){
        return bookService.getBooks();
    }

    @DeleteMapping("/delete-book")
    public void deleteBook(@RequestParam int book_id){
        bookService.deleteBook(book_id);
    }
}