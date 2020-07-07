package com.shumsky.LessonN;

import java.util.Objects;

public abstract class Cards {
    private String name;
    private int balance;

    public abstract void withdraw(int money) throws ZeroBalanceException;

    public abstract void addToBalance(int money);

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Cards) return false;
        Cards card = (Cards) o;
        if (balance == card.balance) return true;
        return Objects.equals(name, card.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, balance);
    }
}


