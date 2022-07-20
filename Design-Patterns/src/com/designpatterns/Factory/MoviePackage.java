package com.designpatterns.Factory;

import java.util.ArrayList;
import java.util.List;

public abstract class MoviePackage {
    protected List<Movies> movies = new ArrayList<>();

    public MoviePackage() {
        createMoviePackage();
    }

    protected abstract void createMoviePackage();

    public void order() {
        int i = 0;
        while (movies.size() > i) {
            movies.get(i).order();
            i++ ;
        }
    }

    public int returnPrice() {
        int i = 0;
        int totalprice = 0;
        while (movies.size() > i) {
            totalprice += movies.get(i).returnPrice();
            i++;
        }
        return totalprice;
    }
}
