package org.java.bin.sort;

import org.apache.commons.lang3.ArrayUtils;
import org.java.bin.datastructure.sort.InsertSort;
import org.java.bin.datastructure.sort.Sort;

import java.util.Random;

/**
 * Created by wangbin on 2017/8/15.
 */
public class SortTestHelper {
    public static int[] getRandom(int n, int rangeL, int rangeR) {
        Random random = new Random(System.currentTimeMillis());
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = random.nextInt(rangeR - rangeL + 1) + rangeL;
        }
        return res;
    }

    public static int[] copyArray(int[] arr) {
        if (ArrayUtils.isEmpty(arr)) {
            return new int[0];
        }

        int len = arr.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = arr[i];
        }

        return res;
    }

    public static void printArr(Integer[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static boolean isSorted(int[] a) {
        if (a == null || a.length == 0) {
            return false;
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                return false;
            }
        }
        return true;
    }
}
