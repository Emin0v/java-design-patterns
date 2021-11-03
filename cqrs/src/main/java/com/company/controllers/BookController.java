package com.company.controllers;

import com.company.dtos.BookDto;
import com.company.service.query.IBookQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/author")
public class BookController {

    private final IBookQueryService queryService;

    @GetMapping
    public ResponseEntity<List<BookDto>> getAuthorBooks(@RequestParam String uuid){
        return ResponseEntity.ok(queryService.getAuthorBooks(uuid));
    }
}
