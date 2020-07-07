package com.shumsky.heap;

import java.util.Arrays;

public class ArraysSumOfNumber {
    public static int corectNum(int num) {
        String str = "" + num;
        System.out.println();
        int sum = 0;
        char[] arrayNum = str.toCharArray();
        System.out.println(Arrays.toString(arrayNum));
        for (int i = 0; i < arrayNum.length; i++) {
            str = String.valueOf(arrayNum[i]);
            sum += Integer.parseInt(str);

        }
        return sum;
    }
    public static void sortArray(int[]array){
        boolean flag = false;
        while (!flag){
            flag=true;
            for (int i=0;i<array.length-1;i++){
                if(array[i+1]<array[i]){
                    flag =false;
                    int memory =array[i];
                    array[i]=array[i+1];
                    array[i]=0;
                }
            }
        }
    }

    public static void arraysSumOfNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = corectNum(array[i]);
        }
        sortArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int [] array={12,54,23,12,56,567,345,23,12};
        arraysSumOfNumber(array);
    }
}

