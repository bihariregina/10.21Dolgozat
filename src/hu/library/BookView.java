/*
* File: BookView.java
* Author: Bihari Regina
* Copyright: 2026, Bihari Regina
* Group: Szoft I
* Date: 2026-10-21
* Github: 
* Licenc: MIT
*/

package hu.library;

import java.util.List;

public class BookView {

    public void displayBooks(List<Book> books) {

        System.out.printf(
            "%-5s %-23s %-22s %-5s%n",
            "Id", "Cím", "Szerző", "Év"
        );

        for (Book book : books) {

            System.out.printf(
                "%-5d %-23s %-22s %-5d%n",
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getYear()
            );
        }
    }
}