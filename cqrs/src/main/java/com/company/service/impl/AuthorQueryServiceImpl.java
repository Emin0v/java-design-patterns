package com.company.service.impl;

import com.company.dtos.AuthorDto;
import com.company.exceptions.AuthorNotFoundException;
import com.company.repository.AuthorRepository;
import com.company.repository.BookRepository;
import com.company.service.query.IAuthorQueryService;
import com.company.service.adapter.AuthorAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthorQueryServiceImpl implements IAuthorQueryService {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final AuthorAdapter authorAdapter;

    @Override
    public AuthorDto getAuthorByUuid(String uuid) {
        return authorAdapter.map(authorRepository.findByUuid(uuid)
                .orElseThrow(AuthorNotFoundException::new));
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
