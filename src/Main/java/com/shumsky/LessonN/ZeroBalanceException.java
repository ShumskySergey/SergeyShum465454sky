package com.shumsky.LessonN;

public class ZeroBalanceException extends Exception{
private int money;
    ZeroBalanceException(int money) {
this.money= money;
    }
    public int getMoney(){
        return money;
    }


}
