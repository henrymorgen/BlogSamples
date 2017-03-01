package com.example;

/**
 * Created by Administrator on 2017/2/26 0026.
 */

/**
 * 选择排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {5, 4, 8, 7, 9, 3, 1};
        ArrayUtils.printArray(a);
        int b[] = selection(a);
        ArrayUtils.printArray(b);
    }

    public static int[] selection(int[] a) {
        int i, j, min, v;
        int n = a.length;
        for (i = 0; i < n; i++) {
            //每次将未排序部分的首元素赋值给下标min
            min = i;
            //得到未排序部分的最小值的下标并赋值给
            for (j = i+1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            v = a[i];
            a[i] = a[min];
            a[min] = v;
        }
        return a;
    }
}
