/*
* File: BookController.java
* Author: Bihari Regina
* Copyright: 2026, Bihari Regina
* Group: Szoft I
* Date: 2026-10-21
* Github: 
* Licenc: MIT
*/

package hu.library;

import java.util.List;

public class BookController {

    private final BookService bookService;
    private final BookView bookView;

    public BookController(
        BookService bookService,
        BookView bookView
    ) {
        this.bookService = bookService;
        this.bookView = bookView;
    }

    public void showBooks() {

        List<Book> books = bookService.getAllBooks();

        bookView.displayBooks(books);
    }
}