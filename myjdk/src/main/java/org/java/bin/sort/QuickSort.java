package org.java.bin.sort;

import org.java.bin.datastructure.sort.SortTestHelper;

import java.util.Arrays;

/**
 * Created by wangbin on 16/12/21.
 */
public class QuickSort {
    static final int MAX_LENGTH = 5;

    public static void quickSort(int[] arr) {
        qSort(arr, 0, arr.length - 1);
    }

    private static void qSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            qSort(arr, low, pivot - 1);
            qSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivot) {
                high--;
            }
            arr[low] = arr[high];

            while (low < high && arr[low] <= pivot) {
                low++;
            }
            arr[high] = arr[low];
        }

        arr[low] = pivot;
        return low;
    }

    public static void quickSort01(int[] a) {
        qSort01(a, 0, a.length - 1);
    }

    private static void qSort01(int[] a, int low, int high) {
        if ((high - low) > MAX_LENGTH) {
            while (low < high) {
                int pivot = partition01(a, low, high);
                qSort(a, low, pivot - 1);
                low = pivot + 1;
            }
        }
    }

    private static int partition01(int[] a, int low, int high) {
        chosePivot(a, low, high);
        int pivotValue = a[low];

        while (low < high) {
            while (low < high && a[high] > pivotValue) {
                high--;
            }
            a[low] = a[high];
            while (low < high && a[low] < pivotValue) {
                low++;
            }
            a[high] = a[low];
        }

        a[low] = pivotValue;
        return low;
    }

    private static void chosePivot(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (a[low] > a[high]) {
            swap(a, low, high);
        }
        if (a[mid] > a[high]) {
            swap(a, mid, high);
        }
        if (a[mid] > a[low]) {
            swap(a, low, mid);
        }
    }

    private static void swap(int[] a, int low, int high) {
        int temp = a[low];
        a[low] = a[high];
        a[high] = temp;
    }

    public static void div3DeScanSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = arr[low];

            int lt = low, gt = high + 1, i = low + 1;
            OUT_LOOP:
            while (i < gt) {
                if (arr[i] < pivot) {
                    swap(arr, i, lt + 1);
                    lt++;
                    i++;
                } else if (arr[i] == pivot) {
                    i++;
                } else {
                    while (arr[gt - 1] > pivot) {
                        gt--;
                        if (i > gt) {
                            break OUT_LOOP;
                        }
                    }

                    if (arr[gt - 1] < pivot) {
                        swap(arr, gt - 1, i);
                        swap(arr, lt + 1, i);
                        lt++;
                    } else {
                        swap(arr, gt - 1, i);
                    }
                    i++;
                    gt--;
                }
            }
            swap(arr, low, lt);
            div3DeScanSort(arr, low, lt - 1);
            div3DeScanSort(arr, gt, high);
        }
    }

    public static void dualPivotQuickSort(int[] arr, int low, int high) {

        if (low < high) {
            System.out.println("low = " + low + ", arr[low] = " + arr[low] + "high = " + high + ", arr[high] = " + arr[high]);
            if (arr[low] > arr[high]) {
                swap(arr, low, high);
            }

            int pivot1 = arr[low], pivot2 = arr[high];
            int lt = low, gt = high + 1, i = low + 1;
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
                        if (i > gt) {
                            break OUT_LOOP;
                        }
                    }

                    if (arr[gt - 1] < pivot1) {
                        swap(arr, i, gt - 1);
                        swap(arr, i, lt + 1);
                        lt++;
                    } else {
                        swap(arr, i, gt - 1);

                    }
                    i++;
                    gt--;
                }
            }

            System.out.println("lt = " + lt + ", gt = " + gt);
            swap(arr, low, lt);
            if (gt - 1 < high) {
                swap(arr, gt - 1, high);
            }

            dualPivotQuickSort(arr, low, lt-2);
            dualPivotQuickSort(arr, lt + 1, gt - 1);
            dualPivotQuickSort(arr, gt, high);
        } else {
            return;
        }
    }

    public static void dualPivotQuickSort2(int[] items, int start, int end) {
        if (start < end) {
            if (items[start] > items[end]) {
                swap(items, start, end);
            }
            int pivot1 = items[start], pivot2 = items[end];
            int i = start, j = end, k = start + 1;
            OUT_LOOP: while (k < j) {
                if (items[k] < pivot1) {
                    swap(items, ++i, k++);
                } else if (items[k] <= pivot2) {
                    k++;
                } else {
                    while (items[--j] > pivot2) {
                        if (j <= k) {
                            // 扫描终止
                            break OUT_LOOP;
                        }
                    }

                    if (items[j] < pivot1) {
                        swap(items, j, k);
                        swap(items, ++i, k);
                    } else {  swap(items, j, k);
                    }
                    k++;
                }
            }
            swap(items, start, i);
            swap(items, end, j);

            dualPivotQuickSort(items, start, i - 1);
            dualPivotQuickSort(items, i + 1, j - 1);
            dualPivotQuickSort(items, j + 1, end);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = SortTestHelper.getRandom(10, 0, 200);
        int[] copy = new int[arr.length];
        int[] copy1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
            copy1[i] = arr[i];
        }

        div3DeScanSort(copy, 0, copy.length - 1);
        System.out.println(SortTestHelper.isSorted(copy));

        System.out.println("******************************");
        dualPivotQuickSort2(copy1, 0, copy1.length - 1);
        printArr(copy1);
        System.out.println(SortTestHelper.isSorted(copy1));
    }

    public static void printArr(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
