package com.shumsky.animal;

public class Cat extends Animal {
private String leg;
    public Cat(String food, String location, String leg) {
        super(food, location);
        this.leg=leg;
    }


    @Override
    public void eat() {
        System.out.println("Kushaet");

    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
