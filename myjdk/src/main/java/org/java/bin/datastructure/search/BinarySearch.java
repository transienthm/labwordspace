package org.java.bin.datastructure.search;

/**
 * Created by wangbin on 2017/8/18.
 */
public class BinarySearch {

    public int find(int[] a, int target) {
        if (a == null || a.length == 0) {
            return -1;
        }
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] < target) {
                l = mid + 1;
            } else if (a[mid] > target) {
                r = mid - 1;
            }
        }
        return -1;
    }

/*    public int findRec(int[] a, int low, int high, int target) {
        if (a == null || a.length == 0 || low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;
        if (a[mid] == target) {

        }
    }*/
}
