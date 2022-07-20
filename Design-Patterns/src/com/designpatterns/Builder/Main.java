package com.designpatterns.Builder;

public class Main {
    public static void main(String[] args) {
        CarpentryTelescopic1 carpentryTelescopic1 = new CarpentryTelescopic1("Windows","Aluminium", "Maintenance");
        System.out.println(carpentryTelescopic1);

        CarpentryTelescopic2 carpentryTelescopic2 = new CarpentryTelescopic2("Doors", "PVC Sheets", "Yard", "Joints");
        System.out.println(carpentryTelescopic2);

        Carpentry.Builder builder = new Carpentry.Builder("Windows");;
        Carpentry carpentry = builder.shipCarpentry("Dock").CabinetCarpentry("Drawer").build();
        System.out.println(carpentry);
    }
}
