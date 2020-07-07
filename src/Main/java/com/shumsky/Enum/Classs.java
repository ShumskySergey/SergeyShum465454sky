package com.shumsky.Enum;

import java.util.Arrays;
import java.util.Collections;

public class Classs {
    public int[] sort(int[]arr){
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        return arr;

    }
    public int sum(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mult(int a,int b){
        return a*b;
    }
    public int del(int a,int b){
        return a/b;
    }
}