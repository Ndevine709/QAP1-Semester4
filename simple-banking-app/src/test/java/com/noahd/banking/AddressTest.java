package com.noahd.banking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddressTest {

    @Test
    void testAddressInitialization() {
        Address testAddress = new Address("123 George St", "St. John's", "NL", "A1A2R2");

        assertEquals("123 George St", testAddress.getStreet());
        assertEquals("St. John's", testAddress.getCity());
        assertEquals("NL", testAddress.getState());
        assertEquals("A1A2R2", testAddress.getZip());
    }

    @Test
    void testToStringMethod() {
        Address testAddress = new Address("123 George St", "St. John's", "NL", "A1A2R2");

        String expectedOutcome = "123 George St, St. John's, NL A1A2R2";

        assertEquals(expectedOutcome, testAddress.toString());
    }
}
