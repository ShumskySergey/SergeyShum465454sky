package com.shumsky.LessonN;

public class ResultClass {
    public static void main(String[] args) {
        Cards cards1 = new DebCard("Alesha");
        Cards cards2 = new CreditCard("Alesha", 200);
        Cards cards3 = new CreditCard();
        cards3.setBalance(200);
        cards3.setName("Aleksey");
        cards1.setBalance(50);
        ATM.withdraw(cards2,200);
        System.out.println(cards2.getBalance());
        try {
            cards1.addToBalance(200);
            cards2.addToBalance(50);
            cards3.addToBalance(20);
            cards2.withdraw(300);
            cards1.withdraw(300);
            cards3.withdraw(300);

        } catch (ZeroBalanceException zero) {
            System.out.println("NADO "+zero.getMoney());
        } catch (MinusAddException monay) {
            System.out.println("MINUSADD");
        }
    }
}
