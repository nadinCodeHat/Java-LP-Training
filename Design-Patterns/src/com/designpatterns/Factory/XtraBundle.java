package com.designpatterns.Factory;

public class XtraBundle extends MoviePackage{
    @Override
    protected void createMoviePackage() {
        movies.add(new LargePopcornTub());
        movies.add(new Beverages());
        movies.add(new ExtraTicket());
    }
}
