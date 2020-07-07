package com.shumsky.animal;

public class Dog extends Animal {
    private String leg;
    public Dog(String food, String location, String leg) {
        super(food, location);
        this.leg=leg;
    }


    @Override
    public void eat() {
        System.out.println("Gryzet");

    }

    @Override
    public void makeNoise() {
        System.out.println("awuuuuuuuuu");

    }
}
