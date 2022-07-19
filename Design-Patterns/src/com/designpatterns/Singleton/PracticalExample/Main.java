package com.designpatterns.Singleton.PracticalExample;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        long start;
        long end;

        //First instance
        BookISBN bookISBN = BookISBN.getBookISBN();
        System.out.println("Book ISBN Instance 01: "+ bookISBN);

        start = System.currentTimeMillis();
        Connection connection = bookISBN.getConnection();
        end = System.currentTimeMillis();

        System.out.println("Time taken to create first instance: "+ (end-start));


        //Second instance
        BookISBN bookISBN1 = BookISBN.getBookISBN();
        System.out.println("Book ISBN Instance 02: "+ bookISBN1);

        start = System.currentTimeMillis();
        Connection connection1 = bookISBN.getConnection();
        end = System.currentTimeMillis();

        System.out.println("Time taken to create second instance: "+ (end-start));
    }
}
