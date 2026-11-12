/*
* File: BookService.java
* Author: Bihari Regina
* Copyright: 2026, Bihari Regina
* Group: Szoft I
* Date: 2026-10-21
* Github: 
* Licenc: MIT
*/
package hu.library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookService {

    private final DatabaseInterface database;

    public BookService(DatabaseInterface database) {
        this.database = database;
    }

    public List<Book> getAllBooks() {

        List<Book> books = new ArrayList<>();

        String sql = """
            SELECT id, title, author, year, pages
            FROM books
            ORDER BY id
            """;

        try (Connection connection = database.getConnection();
             PreparedStatement statement =
                 connection.prepareStatement(sql);
             ResultSet result = statement.executeQuery()) {

            while (result.next()) {

                Book book = new Book(
                    result.getInt("id"),
                    result.getString("title"),
                    result.getString("author"),
                    result.getInt("year"),
                    result.getInt("pages")
                );

                books.add(book);
            }

        } catch (SQLException e) {
            System.err.println(
                "Lekérdezési hiba: " + e.getMessage()
            );
        }

        return books;
    }
}