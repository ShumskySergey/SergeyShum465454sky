package com.shumsky.animal;

public abstract class Animal {
    protected String food;
    protected String location;

   public Animal(String food, String location){
        this.location=location;
        this.food=food;
    }

    public void sleep(){
        System.out.println("Sleeping");
    }

    public abstract void eat();
    public abstract void makeNoise();
}
