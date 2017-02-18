package com.example;

import java.util.AbstractCollection;

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int a[] = {8, 3, 1, 5, 2, 1};
        ArrayUtils.printArray(a);
        int b[] = insert(a);
        ArrayUtils.printArray(b);
    }

    public static int[] insert(int[] a) {
        int i, j, v;
        int n = a.length;
        for (i = 1; i < n; i++) {
            v = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > v) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = v;
        }
        return a;
    }
}


