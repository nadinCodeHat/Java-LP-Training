package com.designpatterns.Factory;

public class FamilyBundle extends MoviePackage{
    @Override
    protected void createMoviePackage() {
        movies.add(new MediumPopcornTub());
        movies.add(new Beverages());
    }
}