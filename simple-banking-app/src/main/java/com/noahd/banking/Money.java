package com.noahd.banking;

/**
 * Represents a monetary amount in dollars and cents.
 * This class represents a fixed amount of money and lets you perform basic math and comparisons with it
 */
public class Money {
    private final long dollars;
    private final long cents;

    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - dollars) * 100);
    }

    /**
     * Constructs a new Money object by copying another.
     *
     * @param otherAmount the Money object to copy
     */
    public Money(Money otherAmount) {
        this.dollars = otherAmount.dollars;
        this.cents = otherAmount.cents;
    }

    public Money add(Money otherAmount) {
        long totalCents = this.cents + otherAmount.cents;
        long totalDollars = this.dollars + otherAmount.dollars + totalCents / 100;
        totalCents = totalCents % 100;
        return new Money(totalDollars + totalCents / 100.0);
    }

    public Money subtract(Money otherAmount) {
        long totalCents = this.cents - otherAmount.cents;
        long totalDollars = this.dollars - otherAmount.dollars;

        if (totalCents < 0) {
            totalCents += 100;
            totalDollars -= 1;
        }
        return new Money(totalDollars + totalCents / 100.0);
    }

    public int compareTo(Money otherObject) {
        if (this.dollars != otherObject.dollars) {
            return Long.compare(this.dollars, otherObject.dollars);
        } else {
            return Long.compare(this.cents, otherObject.cents);
        }
    }

    public boolean isEqualTo(Money otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
