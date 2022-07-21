package com.designpatterns.Memento;

import java.util.ArrayList;

//Originator
public class Container {
    ArrayList<Stock> stockItems = new ArrayList<>();

    public void addStock(Stock stock) {
        stockItems.add(stock);
    }

    public ArrayList<Stock> getStockItems() {
        return (ArrayList) stockItems.clone();
    }

    public ContainerMemento stuffing(){
        return new ContainerMemento(getStockItems());
    }

    public void destuffing(ContainerMemento containerMemento) {
        stockItems = containerMemento.getStockItems();
    }

    @Override
    public String toString() {
        return "Container{" +
                "stockItems=" + stockItems +
                '}';
    }

    static class ContainerMemento {
        ArrayList<Stock> stockItems;

        public ContainerMemento(ArrayList<Stock> stockItems){
            this.stockItems = stockItems;
        }

        private ArrayList<Stock> getStockItems() {
            return stockItems;
        }
    }
}
