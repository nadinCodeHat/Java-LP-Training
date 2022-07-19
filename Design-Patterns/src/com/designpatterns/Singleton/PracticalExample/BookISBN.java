package com.designpatterns.Singleton.PracticalExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookISBN {
    private static volatile BookISBN bookISBN;
    private static volatile Connection connection;

    private BookISBN() {
        if(bookISBN != null){
            throw new RuntimeException("Please use getBookISBN method");
        }
     }

    public static BookISBN getBookISBN() {
        if(bookISBN==null){
            synchronized (BookISBN.class){
                if(bookISBN==null){
                    bookISBN = new BookISBN();
                }
            }
        }
        return bookISBN;
    }

    public Connection getConnection() {
        if(connection==null){
            synchronized (BookISBN.class) {
                if(connection==null) {
                    String url = "jdbc:mysql://localhost:3306";
                    String root = "root";
                    String password = "";
                    try {
                        connection = DriverManager.getConnection(url, root, password);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }
}
