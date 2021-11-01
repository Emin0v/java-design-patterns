package com.company.queries;

import com.company.model.Author;
import com.company.model.Book;

import java.util.List;

public class QueryServiceImpl implements IQueryService{

    @Override
    public Author getAuthorByUuid(String uuid) {
        return null;
    }

    @Override
    public Book getBook(String title) {
        return null;
    }

    @Override
    public List<Book> getAuthorBooks(String uuid) {
        return null;
    }

    @Override
    public Integer getAuthorBooksCount(String username) {
        return null;
    }

    @Override
    public Integer getAuthorsCount() {
        return null;
    }
}
