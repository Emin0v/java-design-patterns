//package com.company.queries;
//
//import com.company.commands.ICommandService;
//import com.company.com.company.model.Author;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//class QueryServiceImplTest {
//
//    @Autowired
//    private IQueryService queryService;
//
//    @Autowired
//    private ICommandService commandService;
//
//    @BeforeEach
//    void setUp() {
//        System.out.println("set up called");
//
//        Author author = new Author("testAuthorName","test@mail.ru");
//
//        commandService.authorCreated("testAuthorName1", "test1@mail.ru");
//
//        commandService.authorCreated("testAuthorName2", "test2@mail.ru");
//
//
////        commandService.bookAddedToAuthor("title1", BigDecimal.valueOf(10), "username1");
////
////        commandService.bookAddedToAuthor("title2", 20, "username1");
////        commandService.bookPriceUpdated("title2", 30);
////        commandService.bookTitleUpdated("title2", "new_title2");
//
////        Book book = new Book("testBookTitle", BigDecimal.valueOf(10),author);
//
//    }
//
//    @Test
//    void getBook() {
//        var book = queryService.getBook("testBookTitle");
//
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