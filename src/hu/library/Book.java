/*
* File: Book.java
* Author: Bihari Regina
* Copyright: 2026, Bihari Regina
* Group: Szoft I
* Date: 2026-10-21
* Github: 
* Licenc: MIT
*/

package hu.library;

public class Book {

    private int id;
    private String title;
    private String author;
    private int year;
    private int pages;

    public Book(int id, String title, String author,
                int year, int pages) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }
}