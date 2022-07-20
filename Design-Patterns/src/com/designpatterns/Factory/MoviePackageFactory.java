package com.designpatterns.Factory;

public class MoviePackageFactory {
    public static MoviePackage createMoviePackage(MoviePackageCode moviePackageCode){
        switch (moviePackageCode) {
            case DUO:
                System.out.println("--------Duo Bundle--------");
                return new DuoBundle();
            case FAMILY:
                System.out.println("-------Family Bundle-------");
                return new FamilyBundle();
            case XTRA:
                System.out.println("--------Xtra Bundle--------");
                return new XtraBundle();
            default:
                return null;
        }
    }
}
