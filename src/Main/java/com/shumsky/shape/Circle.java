package com.shumsky.shape;

public class Circle extends Shape {
    private int pointO;
    private int radius;
    public Circle(int radius, int pointO, String color){
        super(color);
       this.radius=radius;
       this.pointO=pointO;

    }
    @Override
    public void drow9() {
        System.out.println(radius+" "+ pointO+" "+ color);

    }
}
