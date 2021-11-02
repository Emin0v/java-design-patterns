package com.company.queries;

import com.company.model.Author;
import com.company.model.Book;

import java.util.List;

public interface IQueryService {

    Author getAuthorByUuid(String uuid);

    Book getBook(String title);

    List<Book> getAuthorBooks(String uuid);

    long getAuthorBooksCount(String uuid);

    long getAuthorsCount();

}
