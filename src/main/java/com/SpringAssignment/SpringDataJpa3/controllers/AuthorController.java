package com.SpringAssignment.SpringDataJpa3.controllers;

import com.SpringAssignment.SpringDataJpa3.models.Author;
import com.SpringAssignment.SpringDataJpa3.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }

    @PostMapping("/add")
    Author addAuthor(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }

    @GetMapping("/all")
    List<Author> getAuthors(){
        return authorService.getAuthors();
    }
}
