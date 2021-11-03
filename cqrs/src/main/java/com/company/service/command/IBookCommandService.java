package com.company.service.command;

import java.math.BigDecimal;

public interface IBookCommandService {

    void bookAddedToAuthor(String title, BigDecimal price, String uuid);

    void bookTitleUpdated(String oldTitle, String newTitle);

    void bookPriceUpdated(String title, BigDecimal price);
}
