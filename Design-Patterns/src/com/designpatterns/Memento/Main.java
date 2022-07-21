package com.designpatterns.Memento;

public class Main {
    public static void main(String[] args) {
        ContainerCaretaker containerCaretaker = new ContainerCaretaker();
        Container container = new Container();

        container.addStock(new Stock("Monitors"));

        container.addStock(new Stock("Laptops"));
        containerCaretaker.stuffing(container);
        System.out.println(container);

        container.addStock(new Stock("Mouse"));
        containerCaretaker.stuffing(container);
        System.out.println(container);

        container.addStock(new Stock("Keyboard"));
        containerCaretaker.stuffing(container);
        System.out.println(container);

        container.addStock(new Stock("Printers"));
        //containerCaretaker.stuffing(container);
        System.out.println(container);

        containerCaretaker.destuffing(container);
        System.out.println(container);

        container.addStock(new Stock("CPU"));
       // containerCaretaker.stuffing(container);
        System.out.println(container);

        containerCaretaker.destuffing(container);
        System.out.println(container);

        containerCaretaker.destuffing(container);
        System.out.println(container);
    }
}
