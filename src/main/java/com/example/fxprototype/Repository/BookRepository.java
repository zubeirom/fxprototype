package com.example.fxprototype.Repository;

import com.example.fxprototype.Model.Book;
import com.example.fxprototype.Utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookRepository {
    Connection conn = Utils.getConnection();
    private void executeQuery(String query) {
        Statement st;
        try {
            st = conn.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
            st = conn.createStatement();
            return st.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
