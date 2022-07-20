package com.designpatterns.Factory;

public class LargePopcornTub extends Movies{
    public final int price = 500;
    @Override
    public void order() {
        System.out.println("Large Popcorn Tub:- "+price);
    }

    @Override
    public int returnPrice() {
        return price;
    }
}
