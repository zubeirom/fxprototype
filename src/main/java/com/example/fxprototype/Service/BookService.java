package com.example.fxprototype.Service;

import com.example.fxprototype.Model.Book;
import com.example.fxprototype.DTO.BookDTO;
import com.example.fxprototype.Repository.BookRepository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookService {

    BookRepository bookRepository = new BookRepository();

    public void insertBook(BookDTO bookDTO) {
        Book newBook = new Book(Integer.parseInt(bookDTO.getId()), bookDTO.getTitle(), bookDTO.getAuthor(), Integer.parseInt(bookDTO.getYear()), Integer.parseInt(bookDTO.getPages()));
        bookRepository.insert(newBook);
    }

    public void updateBook(BookDTO bookDTO) {
        Book book = new Book(Integer.parseInt(bookDTO.getId()), bookDTO.getTitle(), bookDTO.getAuthor(), Integer.parseInt(bookDTO.getYear()), Integer.parseInt(bookDTO.getPages()));
        bookRepository.update(book);
    }

    public void deleteBook(String id) {
        bookRepository.delete(id);
    }

    public List<Book> getAll() {
        List<Book> booksList = new ArrayList<Book>();
        try {
            ResultSet rs = bookRepository.getAll();
            Book book;
            while(rs.next()) {
                book = new Book(rs.getInt("Id"),rs.getString("Title"),rs.getString("Author"),rs.getInt("Year"),rs.getInt("Pages"));
                booksList.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return booksList;
    }
}
