package com.example;

/**
 * Created by Administrator on 2017/12/25 0025.
 */

/**
 * 冒泡排序方式2
 */
public class BubbleSort2 {
    public static void main(String[] args) {
        int a[] = {5, 3, 2, 4, 1};
        ArrayUtils.printArray(a);
        int b[] = bubble(a);
        ArrayUtils.printArray(b);
    }

    public static int[] bubble(int[] a) {
        int i, j, v;
        int n = a.length;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    v = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = v;
                }
            }
        }
        return a;
    }
}
