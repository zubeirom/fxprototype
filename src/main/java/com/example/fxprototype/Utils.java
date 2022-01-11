package com.example.fxprototype;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Utils {
    static Connection conn = Utils.getConnection();

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

    public static void executeQuery(String query) {
        Statement st;
        try {
            st = conn.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
