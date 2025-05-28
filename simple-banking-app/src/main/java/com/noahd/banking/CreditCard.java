package com.noahd.banking;

/**
 * Represents a credit card with a balance, credit limit, and an owner.
 * Allows charging and making payments while enforcing the credit limit.
 */
public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard (Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0);
    }

    public Money getBalance () {
        return new Money(balance);
    }

    public Money getCreditLimit () {
        return new Money(creditLimit);
    }

    public String getOwnerDetails () {
        return owner.toString();
    }

    /**
     * Attempts to charge the specified amount to the card.
     * If the charge exceeds the credit limit, it is declined.
     *
     * @param amount the amount to charge
     */
    public void chargeToCard(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    /**
     * Applies a payment to reduce the card balance.
     *
     * @param amount the amount to pay
     */
    public void makePayment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
