package com.shumsky.LessonN;

public class ATM {
    public static void withdraw(Cards card,int money){
        card.addToBalance(money);
    }
}
