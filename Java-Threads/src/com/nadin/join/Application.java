package com.nadin.join;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();

        Thread thread = new Thread(printer);

        System.out.println("Main Thread Priority " + Thread.currentThread().getPriority());

        System.out.println("Child Thread Priority " + thread.getPriority());

        thread.start();
        //thread.join(2000);

        for (int j = 0; j < 10; j++) {
            System.out.println("Main "+ Thread.currentThread().getName()+ " " + j);
        }
        System.out.println("------------Completed------------");
        thread.interrupt();
    }
}
