package org.example;

public class App {
    public void run(){
        Address address = new Address();
        address.setCity("Narva");
        address.setState("Ida-Virumaa");
        address.setZip("41536");
        address.setStreet("Tallinn street");
        address.setHouse("80");
        address.setRoom("20");
        Person person = new Person("Ivan", "Ivanov", 10, 10, 2000, address);
        Employee employee = new Employee(person,"Director", "3000");


    }

}
