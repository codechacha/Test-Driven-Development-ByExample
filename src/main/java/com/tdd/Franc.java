package com.tdd;

public class Franc extends Money {

    Franc(int amount) {
        this.amount = amount;
    }

    @Override
    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
