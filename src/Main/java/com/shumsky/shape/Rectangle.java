package com.shumsky.shape;

public class Rectangle extends Shape {
    private int pointA;
    private int pointB;
    private int pointC;
    private int pointD;

    public Rectangle(int pointA, int pointB, int pointC, int pointD, String color) {
        super(color);
        this.pointA = pointA;
        this.pointD = pointD;
        this.pointB = pointB;
        this.pointC = pointC;

    }
@Override
    public void drow9() {
        System.out.println(pointA + " " + pointB + " " + pointC + " " + pointD +" "+color);
    }

}
