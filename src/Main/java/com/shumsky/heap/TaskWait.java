package com.shumsky.heap;

import java.util.Arrays;

public class TaskWait {
    public static void reserchArrays(int[] array1, int[] array2) {
        String str1 ="";
        String str2 = "";
        for (int a:array1){
            str1=str1+a;
        }for (int a:array2){
            str2=str2+a;
        }
        System.out.println(str1);
        char[] array1cahr = str1.toCharArray();
        char[] array2cahr = str2.toCharArray();
        for (int i = 0; i < array1cahr.length; i++) {
            for (int j = 0; j < array1cahr.length; j++) {
                if (array1cahr[i] == array1cahr[j] & i != j) {
                    array1cahr[j] = 'a';
                }
            }
        }
        for (int i = 0; i < array1cahr.length; i++) {
            for (int j = 0; j < array2cahr.length; j++) {
                if (array1cahr[i] == array2cahr[j] & i != j) {
                    array2cahr[j] = 'a';
                }
            }
        }
        System.out.println(Arrays.toString(array1cahr));
        System.out.println(Arrays.toString(array2cahr));
        chekArray(array1cahr, array2cahr);
    }

    public static void chekArray(char[] array1, char[] array2) {
        int lenghtOfSym = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != 'a') {
                lenghtOfSym++;
            }
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != 'a') {
                lenghtOfSym++;
            }
        }
        char[] arrayResult = new char[lenghtOfSym];
        resultArray(array1, array2, arrayResult);
    }

    public static void resultArray(char[] array1, char[] arra2, char[] arrayResult) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != 'a') {
                arrayResult[count] = array1[i];
                count++;
            }
        }
        for (int i = 0; i < arra2.length; i++) {
            if (arra2[i] != 'a') {
                arrayResult[count] = arra2[i];
                count++;
            }
        }
        Arrays.toString(arrayResult);
    }

    public static void main(String[] args) {
        int[] arra1 = {1,2,5 };
        int[] arra2 = {1, 2,3,4,5};
        reserchArrays(arra1, arra2);
    }
}
