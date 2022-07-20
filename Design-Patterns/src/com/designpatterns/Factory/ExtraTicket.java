package com.designpatterns.Factory;

public class ExtraTicket extends Movies{
    @Override
    public void order() {
        System.out.println("You get an Extra Ticket");
    }

    @Override
    public int returnPrice() {
        return 0;
    }
}
