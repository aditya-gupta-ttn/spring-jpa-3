package com.SpringAssignment.SpringDataJpa3.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "author_id")
//    private Author author;

//    @ManyToMany(mappedBy = "books")
    @ManyToMany
    private List<Author> authors;

    private String bookName;
}