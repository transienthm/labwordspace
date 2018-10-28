package org.java.bin.sort;

/**
 * 描述:
 *
 * @author Alcalde
 * @create 2018-10-14 4:26 PM
 */
public class DualPivotQuickSort {
    public static void sort(int[] arr, int low, int high) {
        if (low >= high || low < 0 || high >= arr.length) {
            return;
        }

        int lt = low, gt = high, i = low + 1;
        if (arr[low] >= arr[high]) {
            swap(arr, low, high);
        }
        int pivot1 = arr[low];
        int pivot2 = arr[high];

        while (i < gt) {
            if (arr[i] < pivot1) {
                swap(arr, i, lt + 1);
                lt++;
                i++;
            } else if (arr[i] <= pivot2) {
                i++;
            } else {
                swap(arr, i, gt - 1);
                gt--;
            }
        }

        swap(arr, low, lt);
        swap(arr, high, gt);

        sort(arr, low, lt - 1);
        sort(arr, lt + 1, i - 1);
        sort(arr, gt + 1, high);
    }

    public static void sort2(int[] arr, int low, int high) {
        if (low >= high || low < 0 || high >= arr.length) {
            return;
        }

        int lt = low, gt = high, i = low + 1;
        if (arr[low] >= arr[high]) {
            swap(arr, low, high);
        }
        int pivot1 = arr[low];
        int pivot2 = arr[high];

        OUT_LOOP:
        while (i < gt) {
            if (arr[i] < pivot1) {
                swap(arr, i, lt + 1);
                lt++;
                i++;
            } else if (arr[i] <= pivot2) {
                i++;
            } else {
                while (arr[gt - 1] > pivot2) {
                    gt--;
                    if (i >= gt) {
                        break OUT_LOOP;
                    }
                }

                //arr[gt - 1] < pivot1
                if (arr[gt - 1] < pivot1) {
                    swap(arr, i, gt - 1);
                    swap(arr, i, lt + 1);
                    lt++;
                } else {
                    //pivot1 <= arr[gt - 1] <= pivot2
                    swap(arr, i, gt - 1);
                }
                gt--;
                i++;
            }
        }

        swap(arr, low, lt);
        swap(arr, high, gt);

        sort2(arr, low, lt - 1);
        sort2(arr, lt + 1, i - 1);
        sort2(arr, gt + 1, high);
    }


    private static void swap(int[] arr, int low, int high) {
        int t = arr[low];
        arr[low] = arr[high];
        arr[high] = t;
    }

    public static void main(String[] args) {
        int[] arr = SortTestHelper.getRandom(10000, 0, 2000);

        sort2(arr, 0, arr.length - 1);
        System.out.println(SortTestHelper.isSorted(arr));
    }
}
