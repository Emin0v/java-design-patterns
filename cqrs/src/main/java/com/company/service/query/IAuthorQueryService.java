package com.company.service.query;

import com.company.dtos.AuthorDto;
import com.company.dtos.BookDto;

import java.util.List;

public interface IAuthorQueryService {

    AuthorDto getAuthorByUuid(String uuid);

    long getAuthorBooksCount(String uuid);

    long getAuthorsCount();
}
