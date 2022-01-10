package com.example.fxprototype.Model;

public class Book {
    private final int id;
    private final String title;
    private final String author;
    private final int year;
    private final int pages;

    public Book(int Id, String Title, String Author, int Year, int Pages){
        this.id = Id;
        this.title=Title;
        this.author = Author;
        this.year=Year;
        this.pages=Pages;
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

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }
}
