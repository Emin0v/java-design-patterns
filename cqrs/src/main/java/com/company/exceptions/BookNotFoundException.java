package com.company.exceptions;

public class BookNotFoundException extends RuntimeException{

    private final static String MESSAGE = "Book not found";

    public BookNotFoundException(){
        super(MESSAGE);
    }
}
