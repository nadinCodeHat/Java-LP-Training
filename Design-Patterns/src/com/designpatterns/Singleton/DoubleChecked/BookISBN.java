package com.designpatterns.Singleton.DoubleChecked;

public class BookISBN {
    private static volatile BookISBN bookISBN;

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
}
