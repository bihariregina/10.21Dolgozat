/*
* File: DatabaseSetup.java
* Author: Bihari Regina
* Copyright: 2026, Bihari Regina
* Group: Szoft I
* Date: 2026-10-21
* Github: 
* Licenc: MIT
*/

package hu.library;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseSetup {

    private final DatabaseInterface database;

    public DatabaseSetup(DatabaseInterface database) {
        this.database = database;
    }

    public void initialize() {

        String createTable = """
            CREATE TABLE IF NOT EXISTS books (
                id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                title VARCHAR(100),
                author VARCHAR(100),
                year INTEGER,
                pages INTEGER
            )
            """;

        String insertData = """
            INSERT OR IGNORE INTO books
            (id, title, author, year, pages)
            VALUES
            (1, 'Egri csillagok', 'Gárdonyi Géza', 1901, 580),
            (2, 'A Pál utcai fiúk', 'Molnár Ferenc', 1906, 288),
            (3, 'Légy jó mindhalálig', 'Móricz Zsigmond', 1920, 410),
            (4, 'Tüskevár', 'Fekete István', 1957, 320),
            (5, 'Abigél', 'Szabó Magda', 1970, 450)
            """;

        try (Connection connection = database.getConnection();
             Statement statement = connection.createStatement()) {

            statement.execute(createTable);
            statement.executeUpdate(insertData);

        } catch (SQLException e) {
            System.err.println(
                "Adatbázis hiba: " + e.getMessage()
            );
        }
    }
}