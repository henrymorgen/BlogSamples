package com.example;

/**
 * Created by Administrator on 2017/3/1 0001.
 */

/**
 * 希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        int a[] = {4, 8, 9, 1, 10, 6, 2, 5};
        ArrayUtils.printArray(a);
        int b[] = shellSort(a);
        ArrayUtils.printArray(b);
    }

    public static int[] shellSort(int[] a) {
        int h = 1;
        int n = a.length;
        while (h < n / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            //增量为h的插入排序
            for (int i = h; i < n; i++) {
                int v = a[i];
                int j = i - h;
                while (j >= 0 && a[j] > v) {
                    a[j + h] = a[j];
                    j -= h;
                }
                a[j + h] = v;
            }
            h = h / 3;
        }
        return a;
    }
}
