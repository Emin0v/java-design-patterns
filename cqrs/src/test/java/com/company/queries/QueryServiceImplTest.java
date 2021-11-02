//package com.company.queries;
//
//import com.company.commands.CommandServiceImpl;
//import com.company.model.Author;
//import com.company.model.Book;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.MockitoAnnotations;
//
//import java.math.BigDecimal;
//
//class QueryServiceImplTest {
//
//    private IQueryService service;
//
//    @BeforeEach
//    void setUp() {
//        System.out.println("set up called");
//        var commandService = new CommandServiceImpl();
//
//        service = new QueryServiceImpl();
//
//        Author author = new Author("testAuthorName","test@mail.ru");
//
//        commandService.authorCreated("testAuthorName1", "test1@mail.ru");
//
//        commandService.authorCreated("testAuthorName2", "test2@mail.ru");
//
////        commandService.bookAddedToAuthor("title1", BigDecimal.valueOf(10), "username1");
////
////        commandService.bookAddedToAuthor("title2", 20, "username1");
////        commandService.bookPriceUpdated("title2", 30);
////        commandService.bookTitleUpdated("title2", "new_title2");
//
//        Book book = new Book("testBookTitle", BigDecimal.valueOf(10),author);
//
//    }
//
//    @Test
//    void getBook() {
//        var book = queryService.getBook("testBookTitle");
//        assertEquals("testBookTitle", book.getTitle());
//    }
//
//    @Test
//    void getAuthorBooks() {
//    }
//
//    @Test
//    void getAuthorBooksCount() {
//    }
//
//    @Test
//    void getAuthorsCount() {
//    }
//}