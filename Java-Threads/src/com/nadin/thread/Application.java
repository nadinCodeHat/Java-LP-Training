package com.nadin.thread;

public class Application {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.setDaemon(true);
        printer.start();

        for (int j = 0; j < 10; j++) {
            System.out.println("Main "+ Thread.currentThread().getName()+ " " + j);
        }
        System.out.println("------------Completed------------");
    }
}
