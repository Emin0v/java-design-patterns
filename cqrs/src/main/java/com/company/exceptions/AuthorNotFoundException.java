package com.company.exceptions;

public class AuthorNotFoundException extends RuntimeException{

    private static final String MESSAGE = "Author not found";

    public AuthorNotFoundException(){
        super(MESSAGE);
    }

}
