package com.example.fxprototype.Controller;

import com.example.fxprototype.Model.Book;
import com.example.fxprototype.Model.BookDTO;
import com.example.fxprototype.Service.BookService;
import com.example.fxprototype.Utils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ResourceBundle;

public class IndexController implements Initializable {

    @FXML
    private TextField idField;

    @FXML
    private TextField titleField;

    @FXML
    private TextField authorField;

    @FXML
    private TextField yearField;

    @FXML
    private TextField pagesField;

    @FXML
    private Button insertButton;

    @FXML
    private Button updateButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TableView<Book> TableView;

    @FXML
    private TableColumn<Book, Integer> idColumn;

    @FXML
    private TableColumn<Book, String> titleColumn;

    @FXML
    private TableColumn<Book, String> authorColumn;

    @FXML
    private TableColumn<Book, Integer> yearColumn;

    @FXML
    private TableColumn<Book, Integer> pagesColumn;

    private BookService bookService = new BookService();
    @FXML
    private void insertButton() {
        BookDTO newBook = new BookDTO(idField.getText(), titleField.getText(), authorField.getText(), yearField.getText(), pagesField.getText());
        bookService.insertBook(newBook);
        showBook();
    }


    @FXML
    private void updateButton() {
        BookDTO book = new BookDTO(idField.getText(), titleField.getText(), authorField.getText(), yearField.getText(), pagesField.getText());
        bookService.updateBook(book);
        showBook();
    }

    @FXML
    private void deleteButton() {
        bookService.deleteBook(idField.getText());
        showBook();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        showBook();
    }



    public ObservableList<Book> getBookList(){
        return FXCollections.observableArrayList(bookService.getAll());
    }

    // I had to change ArrayList to ObservableList I didn't find another option to do this but this works :)
    public void showBook() {
        ObservableList<Book> list = getBookList();

        idColumn.setCellValueFactory(new PropertyValueFactory<Book,Integer>("id"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<Book,String>("title"));
        authorColumn.setCellValueFactory(new PropertyValueFactory<Book,String>("author"));
        yearColumn.setCellValueFactory(new PropertyValueFactory<Book,Integer>("year"));
        pagesColumn.setCellValueFactory(new PropertyValueFactory<Book,Integer>("pages"));

        TableView.setItems(list);
    }

}