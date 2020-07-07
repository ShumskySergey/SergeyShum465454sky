package com.shumsky.Shop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Category {
    public Category(String name) {
        this.name = name;
    }

    private String name;
    public List<Something> something = new ArrayList<>();

    public List<Something> getSomething() {
        return something;
    }

    public String getName() {
        return name;
    }

    public void puttSomething(Something some){
        something.add(some);
    }

}
