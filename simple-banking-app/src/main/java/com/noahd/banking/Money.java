package com.noahd.banking;

public class Money {

    private long dollars;
    private long cents;


    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - dollars) * 100);
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
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

    public boolean equals(Money otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
