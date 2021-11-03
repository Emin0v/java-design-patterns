package com.company.controllers;

import com.company.dtos.AuthorDto;
import com.company.service.command.IAuthorCommandService;
import com.company.service.query.IAuthorQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/author")
public class AuthorController {

    private final IAuthorQueryService queryService;
    private final IAuthorCommandService commandService;

    @GetMapping("/books/count")
    public ResponseEntity<Long> getAuthorBooksCount(@RequestParam String uuid){
        return ResponseEntity.ok(queryService.getAuthorBooksCount(uuid));
    }

    @GetMapping
    public ResponseEntity<Long> getAuthorsCount(){
        return ResponseEntity.ok(queryService.getAuthorsCount());
    }


    @PostMapping
    public ResponseEntity<HttpStatus> createAuthor(@RequestBody AuthorDto authorDto){
        commandService.authorCreated(authorDto.getName(), authorDto.getEmail());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
