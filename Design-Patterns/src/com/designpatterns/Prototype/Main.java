package com.designpatterns.Prototype;

public class Main {
    public static void main(String[] args) {
        PersonRegistry registry = new PersonRegistry();

        Customer customer = (Customer) registry.getPerson(PersonType.CUSTOMER);
        System.out.println(customer);

        customer.setAddress("New York");
        System.out.println(customer);

        Customer customer1 = (Customer) registry.getPerson(PersonType.CUSTOMER);
        System.out.println(customer1);
    }
}
