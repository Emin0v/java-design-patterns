//package com.company.commands;
//
//import com.company.model.Author;
//import com.company.repository.AuthorRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CommandServiceImplTest {
//
//    @Mock
//    AuthorRepository authorRepository;
//
//    @InjectMocks
//    CommandServiceImpl commandService;
//
//    @BeforeEach
//    void setUp() {
//        System.out.println("Set up called");
//
//        var author = new Author("testName","testEmail");
//
////        Mockito.when(authorRepository.save(author)).then()
//    }
//
//    @Test
//    void authorCreated() {
//    }
//}