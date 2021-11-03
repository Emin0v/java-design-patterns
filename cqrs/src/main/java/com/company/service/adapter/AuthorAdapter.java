package com.company.service.adapter;

import com.company.dtos.AuthorDto;
import com.company.model.Author;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorAdapter {

    AuthorDto map(Author author);
}
