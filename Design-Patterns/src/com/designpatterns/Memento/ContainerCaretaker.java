package com.designpatterns.Memento;

import java.util.Stack;

public class ContainerCaretaker {
    Stack<Container.ContainerMemento> log = new Stack<>();

    public void stuffing(Container container) {
        log.push(container.stuffing());
    }

    public void destuffing(Container container){
        if(!log.isEmpty()) {
            container.destuffing(log.pop());
        }else {
            System.out.println("Cannot destuff anymore, Container is empty");
        }
    }
}
