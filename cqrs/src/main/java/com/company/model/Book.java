package com.company.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private BigDecimal price;

    @ManyToOne
    private Author author;

    public Book(String title, BigDecimal price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }
}
