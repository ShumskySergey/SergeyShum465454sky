package com.shumsky;

import com.shumsky.Enum.myEnum;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(myEnum.SUMMER);
        System.out.println(myEnum.AUTUM);
        System.out.println(myEnum.SPRING);
        System.out.println(myEnum.WINTER);
        System.out.println(myEnum.WINTER.getDeclaringClass());
        System.out.println(Enum.valueOf(myEnum.class,"WINTER").ordinal());
        List<myEnum>list = new ArrayList<>(List.of(myEnum.WINTER,myEnum.AUTUM,myEnum.SPRING));
        System.out.println(list);
        System.out.println();
    }
}
