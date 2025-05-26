package com.noahd.banking;

public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    public Person (String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    public Address getHome() {
        return home;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString () {
        return (this.firstName + " " + this.lastName + ", " + this.home);
    }
}
