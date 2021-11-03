package com.company.controllers;

import com.company.dtos.BookDto;
import com.company.service.command.IBookCommandService;
import com.company.service.query.IBookQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {

    private final IBookQueryService queryService;
    private final IBookCommandService commandService;

    @GetMapping
    public ResponseEntity<List<BookDto>> getAuthorBooks(@RequestParam String uuid){
        return ResponseEntity.ok(queryService.getAuthorBooks(uuid));
    }

    @PostMapping
    public ResponseEntity<HttpStatus> bookAddedToAuthor(@RequestParam String uuid,
                                                        @RequestBody BookDto bookDto){
        commandService.bookAddedToAuthor(bookDto.getTitle(),bookDto.getPrice(),uuid);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

}
