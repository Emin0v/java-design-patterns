package com.company.service.impl;

import com.company.dtos.BookDto;
import com.company.exceptions.BookNotFoundException;
import com.company.repository.BookRepository;
import com.company.service.query.IBookQueryService;
import com.company.service.adapter.BookAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookQueryServiceImpl implements IBookQueryService {

    private final BookRepository bookRepository;
    private final BookAdapter bookAdapter;

    @Override
    public List<BookDto> getAuthorBooks(String uuid) {
        return bookAdapter.map(bookRepository.findByAuthor_Uuid(uuid));
    }

    @Override
    public BookDto getBook(String title) {
        return bookAdapter.map(bookRepository.findByTitle(title).orElseThrow(BookNotFoundException::new));
    }
}
