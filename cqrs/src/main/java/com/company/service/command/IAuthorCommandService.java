package com.company.service.command;

import java.math.BigDecimal;

public interface IAuthorCommandService {

    void authorCreated(String name, String email);

    void authorNameUpdated(String uuid, String name);

    void authorEmailUpdated(String uuid, String email);
}
