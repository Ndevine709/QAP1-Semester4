package com.noahd.banking;

/**
 * Represents a person with a first name, last name, and home address.
 */
public class Person {
    private final String lastName;
    private final String firstName;
    private final Address home;

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
        return (firstName + " " + lastName + ", " + home);
    }
}
