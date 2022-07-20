package com.designpatterns.Prototype;

import java.util.HashMap;
import java.util.Map;

public class PersonRegistry {
    private Map<PersonType, Person> persons = new HashMap<>();

    public PersonRegistry() {
        this.initialize();
    }

    public Person getPerson(PersonType personType){
        Person person = null;
        try {
            person = (Person) persons.get(personType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }

    private void initialize() {
        Customer customer = new Customer();
        customer.setName("Denzel gray");
        customer.setAddress("California");
        customer.setEmail("denzel@gmail.com");

        Employee employee = new Employee();
        employee.setEmployeeId(10121);
        employee.setName("John Kennedy");
        employee.setAge(30);

        persons.put(PersonType.CUSTOMER, customer);
        persons.put(PersonType.EMPLOYEE, employee);
    }
}
