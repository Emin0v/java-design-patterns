package com.company.commands;

import java.math.BigDecimal;

public interface ICommandService {

    void authorCreated(String name, String email);

    void bookAddedToAuthor(String title, BigDecimal price, String uuid);

    void authorNameUpdated(String uuid, String name);

    void authorEmailUpdated(String uuid, String email);

    void bookTitleUpdated(String oldTitle, String newTitle);

    void bookPriceUpdated(String title, BigDecimal price);

}
