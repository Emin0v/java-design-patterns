package com.company.repository;

import com.company.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book,Long> {

    Optional<Book> findByTitle(String title);

    List<Book> findByAuthor_Uuid(String uuid);

    long countBooksByAuthor_Uuid(String uuid);

}
