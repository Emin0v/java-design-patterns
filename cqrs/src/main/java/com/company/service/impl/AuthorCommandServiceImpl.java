package com.company.service.impl;

import com.company.exceptions.AuthorNotFoundException;
import com.company.model.Author;
import com.company.repository.AuthorRepository;
import com.company.service.command.IAuthorCommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class AuthorCommandServiceImpl implements IAuthorCommandService {

    private final AuthorRepository authorRepository;

    @Override
    @Transactional
    public void authorCreated(String name, String email) {
        var author = new Author(name, email);
        authorRepository.save(author);
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
}
