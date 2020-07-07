package com.shumsky.LessonN;

public class CreditCard extends Cards {
    private String name;
    private int balance;

    CreditCard() {
    }

    CreditCard(String name) {
        this.name = name;
    }

    CreditCard(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public void addToBalance(int money) {
        chekAdd(money);
        balance = balance + money;
    }

    private void chekAdd(int money) throws MinusAddException {
        if (money < 0) {
            throw new MinusAddException(money);
        }
    }

    @Override
    public void withdraw(int money) {
        balance = balance - money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
