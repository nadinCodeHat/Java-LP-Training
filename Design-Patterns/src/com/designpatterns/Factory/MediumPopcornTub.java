package com.designpatterns.Factory;

public class MediumPopcornTub extends Movies{
    public final int price = 400;

    @Override
    public void order() {
        System.out.println("Medium Popcorn Tub:- "+price);
    }

    @Override
    public int returnPrice() {
        return price;
    }
}
