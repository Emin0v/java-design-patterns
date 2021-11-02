package com.company.repository;

import com.company.model.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorRepository extends CrudRepository<Author, Long> {

    Optional<Author> findByUuid(String uuid);

    @Query("SELECT count(id) from Author")
    long countAuthors();

}
