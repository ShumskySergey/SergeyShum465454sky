package com.shumsky.LessonN;

public class DebCard extends Cards {
    private String name;
    private int balance;

    DebCard() {
    }

    DebCard(String name) {
        this.name = name;
    }

    DebCard(String name, int balance) {
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
    public void withdraw(int money) throws ZeroBalanceException {
        chekBalance(money);
        balance = balance - money;

    }

    private void chekBalance(int money) throws ZeroBalanceException {
        if (balance - money < 0) {
            money = money - balance;
            throw new ZeroBalanceException(money);
        }
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
