package com.shumsky.Shop;

public class Something {
    private int raiting;
    private int coast;
    private String name;
    public Something(int raiting, int coast, String name) {
        this.raiting = raiting;
        this.coast = coast;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Something{" +
                "raiting=" + raiting +
                ", coast=" + coast +
                ", name='" + name + '\'' +
                '}';
    }
}
