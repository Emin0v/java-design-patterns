package com.company.queries;

import com.company.exceptions.AuthorNotFoundException;
import com.company.exceptions.BookNotFoundException;
import com.company.model.Author;
import com.company.model.Book;
import com.company.repository.AuthorRepository;
import com.company.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
public class QueryServiceImpl implements IQueryService{

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Override
    public Author getAuthorByUuid(String uuid) {
        Author author = authorRepository.findByUuid(uuid).orElseThrow(AuthorNotFoundException::new);
        return author;
    }

    @Override
    public Book getBook(String title) {
        return bookRepository.findByTitle(title).orElseThrow(BookNotFoundException::new);
    }

    @Override
    public List<Book> getAuthorBooks(String uuid) {
        return bookRepository.findByAuthor_Uuid(uuid);
    }

    @Override
    public long getAuthorBooksCount(String uuid) {
        return bookRepository.countBooksByAuthor_Uuid(uuid);
    }

    @Override
    public long getAuthorsCount() {
        return authorRepository.countAuthors();
    }
}
