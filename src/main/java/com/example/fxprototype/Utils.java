package com.example.fxprototype;

import java.sql.Connection;
import java.sql.DriverManager;

public class Utils {

    public static Connection getConnection() {
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","admin");
            return conn;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
