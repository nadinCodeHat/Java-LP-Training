package com.designpatterns.Factory;

public class Beverages extends Movies {
    public final int price = 100;
    @Override
    public void order() {
        System.out.println("Beverages:- "+price);
    }

    @Override
    public int returnPrice() {
        return price;
    }
}
