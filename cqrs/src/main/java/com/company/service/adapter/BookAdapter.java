package com.company.service.adapter;

import com.company.dtos.BookDto;
import com.company.model.Book;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookAdapter {

    BookDto map(Book book);

    List<BookDto> map(List<Book> book);

}
