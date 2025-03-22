package com.SpringAssignment.SpringDataJpa3.service;

import com.SpringAssignment.SpringDataJpa3.models.Author;
import com.SpringAssignment.SpringDataJpa3.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    public Author addAuthor(Author author){
        return authorRepository.save(author);
    }

    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }
}