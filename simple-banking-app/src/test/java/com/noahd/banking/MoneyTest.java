package com.noahd.banking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MoneyTest {
    
    @Test
    void testAddMoney() {
        Money testMoney1 = new Money(10.50);
        Money testMoney2 = new Money(5.00);
        Money result = testMoney1.add(testMoney2);

        assertEquals("$15.50", result.toString());
    }

    @Test
    void testSubtractMoney() {
        Money testMoney1 = new Money(10.50);
        Money testMoney2 = new Money(5.00);
        Money result = testMoney1.subtract(testMoney2);

        assertEquals("$5.50", result.toString());
    }

    @Test
    void testIsEqualTo() {
        Money testMoney1 = new Money(10.50);
        Money testMoney2 = new Money(10.50);
        Money testMoney3 = new Money(9.99);

        assertTrue(testMoney1.isEqualTo(testMoney2));
        assertFalse(testMoney1.isEqualTo(testMoney3));
    }
}
