package com.nadinCodeHat.equalimplementation;

public class Application {

    public static void main(String[] args) {

        // Employee objects
        Employee emp1 = new Employee(1001,"emp1","john", "89478342V", "France");
        Employee emp2 = new Employee(1001,"emp1","mark", "98394443V", "USA");
        Employee emp3 = new Employee(1002,"emp2","henry", "97232323V", "Aussie");

        // Check if two objects are equal by employeeId and employeeCode
        System.out.println(emp1.equals(emp2));
    }
}
