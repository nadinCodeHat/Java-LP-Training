package com.designpatterns.Factory;

public class Main {
    public static void main(String[] args) {
        MoviePackage moviePackage = MoviePackageFactory.createMoviePackage(MoviePackageCode.DUO);
        print(moviePackage);

        MoviePackage moviePackage1 = MoviePackageFactory.createMoviePackage(MoviePackageCode.FAMILY);
        print(moviePackage1);

        MoviePackage moviePackage2 = MoviePackageFactory.createMoviePackage(MoviePackageCode.XTRA);
        print(moviePackage2);
    }

    public static void print(MoviePackage moviePackage) {
        moviePackage.order();
        System.out.println("Total Price: " + moviePackage.returnPrice());
        System.out.println("---------------------------");
    }
}
