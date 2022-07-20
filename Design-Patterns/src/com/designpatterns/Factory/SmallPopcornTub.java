package com.designpatterns.Factory;

public class SmallPopcornTub extends Movies{
    public final int price = 300;
    @Override
    public void order() {
        System.out.println("Small Popcorn Tub:- "+price);
    }

    @Override
    public int returnPrice() {
        return price;
    }
}
