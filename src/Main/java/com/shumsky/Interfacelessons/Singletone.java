package com.shumsky.Interfacelessons;

public class Singletone {
    private static Singletone instance;

    private Singletone() {
    }

    public static Singletone getInstance() {
        if (instance == null) {
            return instance = new Singletone();
        } else {
            return instance;
        }


    }
}
