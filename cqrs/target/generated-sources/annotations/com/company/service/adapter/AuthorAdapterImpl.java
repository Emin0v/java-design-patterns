package com.company.service.adapter;

import com.company.dtos.AuthorDto;
import com.company.dtos.AuthorDto.AuthorDtoBuilder;
import com.company.model.Author;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-03T17:30:14+0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
@Component
public class AuthorAdapterImpl implements AuthorAdapter {

    @Override
    public AuthorDto map(Author author) {
        if ( author == null ) {
            return null;
        }

        AuthorDtoBuilder authorDto = AuthorDto.builder();

        authorDto.name( author.getName() );
        authorDto.email( author.getEmail() );

        return authorDto.build();
    }
}
