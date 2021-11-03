package com.company.service.query;

import com.company.dtos.BookDto;

import java.util.List;

public interface IBookQueryService {

    List<BookDto> getAuthorBooks(String uuid);

    BookDto getBook(String title);

}
