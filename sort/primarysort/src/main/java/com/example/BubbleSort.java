package com.example;

/**
 * Created by Administrator on 2017/2/17 0017.
 */

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {5, 3, 2, 4, 1};
        ArrayUtils.printArray(a);
        int b[] = bubble(a);
        ArrayUtils.printArray(b);
    }

    public static int[] bubble(int[] a) {
        int i, j, v;
        int n = a.length;
        for (i = 1; i <= n - 1; i++) {
            for (j = n - 1; j >= i ; j--) {
                if (a[j] < a[j - 1]) {
                    v = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = v;
                }
            }
        }
        return a;
    }
}
