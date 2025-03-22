package com.SpringAssignment.SpringDataJpa3.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    String name;
    @Embedded
    private Address address;

    @ElementCollection
    @CollectionTable(name = "author_subjects", joinColumns = @JoinColumn(name = "author_id"))
    @Column(name = "subject")
    @Size(message = "Max number of subjects can be 3", min = 1, max = 3)
    List<String> subjects;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "book_id", referencedColumnName = "id", unique = true)
//    private Book book;

//    @OneToMany(cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "author_id")
//    private List<Book> books;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "author_book_map",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<Book> books;

}