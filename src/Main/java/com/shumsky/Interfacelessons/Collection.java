package com.shumsky.Interfacelessons;

import com.shumsky.animal.Animal;
import com.shumsky.animal.Cat;
import com.shumsky.animal.Veterinar;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        List arrayList = new ArrayList<>();
        LinkedList linckedList = new LinkedList<>();
        HashSet hashSet = new HashSet();
        HashSet hashSet1 =new LinkedHashSet();
        LinkedHashMap hashMap = new LinkedHashMap();

        hashSet.add("21");
        hashSet.add("22");
        hashSet.add("32");
        hashSet.add("33");
        hashSet.add("42");
        hashSet1.add("32");
        hashSet1.add(22);
        hashSet1.addAll(hashSet);
             System.out.println(hashSet1);

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add(6);
        System.out.println(arrayList);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            
        }


}
}
