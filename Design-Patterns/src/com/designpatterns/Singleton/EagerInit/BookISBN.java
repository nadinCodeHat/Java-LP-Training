package com.designpatterns.Singleton.EagerInit;

public class BookISBN {
    private static final BookISBN bookISBN = new BookISBN();

    private BookISBN() {

    }

    public static BookISBN getBookISBN() {
        return bookISBN;
    }
}
