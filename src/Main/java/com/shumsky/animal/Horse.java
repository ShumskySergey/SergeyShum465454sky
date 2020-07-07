package com.shumsky.animal;

public class Horse extends Animal {
    private String leg;
    public Horse(String food, String location, String leg) {
        super(food, location);
        this.leg=leg;
    }


    @Override
    public void eat() {
        System.out.println("Schepaet");
    }

    @Override
    public void makeNoise() {
        System.out.println("Igogo");
    }
}
