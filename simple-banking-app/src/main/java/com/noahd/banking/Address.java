package com.noahd.banking;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    /**
     * Constructs an Address object with the specified street, city, state, and zip code.
     *
     * @param street the street address
     * @param city   the city name
     * @param state  the state abbreviation or name
     * @param zip    the postal zip code
     */
    public Address (String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStreet() {
        return street;
    }

    public String getZip() {
        return zip;
    }

    public String toString () {
        return (street + ", " + city + ", " + state + " " + zip);
    }
}
