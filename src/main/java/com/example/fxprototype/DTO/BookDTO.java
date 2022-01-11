package com.example.fxprototype.DTO;

public class BookDTO {
    private final String id;
    private final String title;
    private final String author;
    private final String year;
    private final String pages;

    public BookDTO(String Id, String Title, String Author, String Year, String Pages){
        this.id = Id;
        this.title=Title;
        this.author = Author;
        this.year=Year;
        this.pages=Pages;
    }

    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public String getPages() {
        return pages;
    }
}
