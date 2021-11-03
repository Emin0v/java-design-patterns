package com.company.service.adapter;

import com.company.dtos.BookDto;
import com.company.dtos.BookDto.BookDtoBuilder;
import com.company.model.Book;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-03T17:30:14+0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
@Component
public class BookAdapterImpl implements BookAdapter {

    @Override
    public BookDto map(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDtoBuilder bookDto = BookDto.builder();

        bookDto.title( book.getTitle() );
        bookDto.price( book.getPrice() );

        return bookDto.build();
    }

    @Override
    public List<BookDto> map(List<Book> book) {
        if ( book == null ) {
            return null;
        }

        List<BookDto> list = new ArrayList<BookDto>( book.size() );
        for ( Book book1 : book ) {
            list.add( map( book1 ) );
        }

        return list;
    }
}
