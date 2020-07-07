package com.shumsky.Shop;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Something goroshek = new Something(5,250,"Gorosek");
        Something tomat = new Something(4,422,"Pomidorka");
        Something apple = new Something(6,210,"Yablocko");
        Something orange = new Something(6,600,"Apelsinka");

        Category vegetables = new Category("Vegan");
        Category fruts = new Category("Fructy");
        Basket basket = new Basket();

        basket.catchSomesing(vegetables);
        fruts.puttSomething(apple);
        fruts.puttSomething(orange);
        vegetables.puttSomething(tomat);
        vegetables.puttSomething(goroshek);
        System.out.println(basket);

        List<Something> ar = vegetables.getSomething();

        System.out.println(ar.get(1));
    }
}
