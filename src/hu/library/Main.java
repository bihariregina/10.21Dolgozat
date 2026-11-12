/*
* File: Main.java
* Author: Bihari Regina
* Copyright: 2026, Bihari Regina
* Group: Szoft I
* Date: 2026-10-21
* Github: 
* Licenc: MIT
*/

package hu.library;

public class Main {

    public static void main(String[] args) {

        DatabaseInterface database =
            new DatabaseConnection();

        DatabaseSetup setup = new DatabaseSetup(database);
        setup.initialize();

        BookService bookService =
            new BookService(database);

        BookView bookView = new BookView();

        BookController controller =
            new BookController(bookService, bookView);

        controller.showBooks();
    }
}