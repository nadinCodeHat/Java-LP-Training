package com.nadin.priority;

public class Application {
    public static void main(String[] args) {
        Printer printer = new Printer();

        System.out.println("Main Thread Priority Before " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(1);

        Thread thread = new Thread(printer);

        thread.setPriority(10);

        System.out.println("Main Thread Priority " + Thread.currentThread().getPriority());

        System.out.println("Child Thread Priority " + thread.getPriority());

        thread.start();

        for (int j = 0; j < 50; j++) {
            System.out.println("Main "+ Thread.currentThread().getName()+ " " + j);
        }
        System.out.println("------------Completed------------");
    }
}
