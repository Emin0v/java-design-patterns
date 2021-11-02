package com.company.commands;

import com.company.exceptions.AuthorNotFoundException;
import com.company.exceptions.BookNotFoundException;
import com.company.model.Author;
import com.company.model.Book;
import com.company.repository.AuthorRepository;
import com.company.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class CommandServiceImpl implements ICommandService{

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Override
    @Transactional
    public void authorCreated(String name, String email) {
        var author = new Author(name,email);
        authorRepository.save(author);
    }

    @Override
    public void bookAddedToAuthor(String title, BigDecimal price, String uuid) {
        Author author = authorRepository.findByUuid(uuid).orElseThrow(AuthorNotFoundException::new);
        Book book = new Book(title,price,author);

        bookRepository.save(book);
    }

    @Override
    @Transactional
    public void authorNameUpdated(String uuid, String name) {
        Author author = authorRepository.findByUuid(uuid).orElseThrow(AuthorNotFoundException::new);
        author.setName(name);
    }

    @Override
    @Transactional
    public void authorEmailUpdated(String uuid, String email) {
        Author author = authorRepository.findByUuid(uuid).orElseThrow(AuthorNotFoundException::new);
        author.setEmail(email);
    }

    @Override
    @Transactional
    public void bookTitleUpdated(String oldTitle, String newTitle) {
         Book book = bookRepository.findByTitle(oldTitle).orElseThrow(BookNotFoundException::new);
         book.setTitle(newTitle);
    }

    @Override
    @Transactional
    public void bookPriceUpdated(String title, BigDecimal price) {
        Book book = bookRepository.findByTitle(title).orElseThrow(BookNotFoundException::new);
        book.setPrice(price);
    }
}
