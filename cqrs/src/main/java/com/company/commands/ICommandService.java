package com.company.commands;

public interface ICommandService {

    void authorCreated(String uuid, String name, String email);

    void bookAddedToAuthor(String title, double price, String uuid);

    void authorNameUpdated(String uuid, String name);

    void authorEmailUpdated(String uuid, String email);

    void bookTitleUpdated(String oldTitle, String newTitle);

    void bookPriceUpdated(String title, double price);

}
