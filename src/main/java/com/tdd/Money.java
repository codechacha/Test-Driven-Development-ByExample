package com.tdd;

abstract class Money {
    protected int amount;

    static public Money dollar(int amount) {
        return new Dollar(amount);
    }

    static public Money franc(int amount) {
        return new Franc(amount);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    abstract Money times(int multiplier);
}
