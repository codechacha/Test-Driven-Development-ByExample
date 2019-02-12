package com.tdd;

abstract class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static public Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static public Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    String currency() {
        return currency;
    }

    abstract Money times(int multiplier);

}
