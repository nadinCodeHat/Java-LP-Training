package com.designpatterns.Memento;

public class Stock {
    String name;

    public Stock(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                '}';
    }
}
