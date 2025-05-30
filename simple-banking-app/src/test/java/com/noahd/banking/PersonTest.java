package com.noahd.banking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void testPersonInitialization() {
        Address testAddress = new Address("123 George St", "St. John's", "NL", "A1A2R2");
        Person testPerson = new Person("Snake", "Solid", testAddress);

        assertEquals("Snake", testPerson.getLastName());
        assertEquals("Solid", testPerson.getFirstName());
        assertEquals(testAddress, testPerson.getHome());
    }

    @Test
    void testNullAddress() {
         Person testPerson = new Person("Snake", "Solid", null);

         assertNull(testPerson.getHome());
         assertEquals("Solid Snake, null", testPerson.toString());
    }
}
