package com.example.fxprototype.Repository;

import com.example.fxprototype.Model.Book;
import com.example.fxprototype.Utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static com.example.fxprototype.Utils.executeQuery;

public class BookRepository {


    public void insert(Book book) {
        String query = "insert into books values("+book.getId()+",'"+book.getTitle()+"','"+book.getAuthor()+"',"+book.getYear()+","+book.getPages()+")";
        executeQuery(query);
    }

    public void update(Book book) {
        System.out.println(book.toString());
        String query = "UPDATE books SET Title='"+book.getTitle()+"',Author='"+book.getAuthor()+"',Year="+book.getYear()+",Pages="+book.getPages()+" WHERE ID="+book.getId()+"";
        executeQuery(query);
    }

    public void delete(String id) {
        String query = "DELETE FROM books WHERE ID="+id+"";
        executeQuery(query);
    }

    public void getOne(int id) {

    }

    public ResultSet getAll() {
        String query = "SELECT * FROM books ";
        Statement st;
        try {
            st = Utils.getConnection().createStatement();
            return st.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
