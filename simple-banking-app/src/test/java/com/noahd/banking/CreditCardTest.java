package com.noahd.banking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreditCardTest {
    private Address testAddress;
    private Person testPerson;
    private CreditCard testCard;

    @BeforeEach
    void setup() {
       testAddress = new Address("123 George St", "St. John's", "NL", "A1A2R2");
       testPerson = new Person("Snake", "Solid", testAddress);
       testCard = new CreditCard(testPerson, new Money(1000.00));

    }
    
    @Test
    void testCreditCardInitialization() {
        assertEquals("$0.00", testCard.getBalance().toString());
        assertEquals("$1000.00", testCard.getCreditLimit().toString());
        assertEquals("Solid Snake, 123 George St, St. John's, NL A1A2R2", testCard.getOwnerDetails());
    }

    @Test
    void testMakePayment() {
        testCard.chargeToCard(new Money(400.00));
        testCard.makePayment(new Money(150.00));
        assertEquals("$250.00", testCard.getBalance().toString());
    }

    @Test
    void testChargeWithinLimit() {
        testCard.chargeToCard(new Money(200.00));
        assertEquals("$200.00", testCard.getBalance().toString());
    }

    @Test
    void testChargeOverLimit() {
        testCard.chargeToCard(new Money(1050.00));
        assertEquals("$0.00", testCard.getBalance().toString());
    }
}
