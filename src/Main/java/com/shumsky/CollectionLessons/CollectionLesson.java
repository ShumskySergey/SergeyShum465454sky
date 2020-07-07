package com.shumsky.CollectionLessons;

import java.util.ArrayList;
import java.util.List;

public class CollectionLesson {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Hello");
        String str = (String) list.get(0);
        System.out.println(str);
    }
}
