package com.designpatterns.Factory;

public class DuoBundle extends MoviePackage{
    @Override
    protected void createMoviePackage() {
        movies.add(new SmallPopcornTub());
    }
}
