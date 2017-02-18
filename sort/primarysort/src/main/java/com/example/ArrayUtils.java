package com.example;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class ArrayUtils {
    public static void printArray(int[] array) {
        System.out.print("{");
        int len=array.length;
        for (int i = 0; i < len; i++) {
            System.out.print(array[i]);
            if (i < len - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
