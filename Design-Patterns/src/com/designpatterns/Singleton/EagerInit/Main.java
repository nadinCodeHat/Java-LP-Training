package com.designpatterns.Singleton.EagerInit;

public class Main {

    public static void main(String[] args) {
        BookISBN bookISBN = BookISBN.getBookISBN();
        System.out.println("Book ISBN Instance 01: "+ bookISBN);

        BookISBN bookISBN1 = BookISBN.getBookISBN();
        System.out.println("Book ISBN Instance 02: "+ bookISBN1);
    }
}
