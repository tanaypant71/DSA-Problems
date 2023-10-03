import java.util.Collections;

public class Solution {

    public static void conquer(int[] arr, int si, int mid, int ei) {
        int merge[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] < arr[idx2]) {
                merge[x++] = arr[idx1++];
            } else {
                merge[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merge[x++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            merge[x++] = arr[idx2++];
        }

        for (x = 0, idx1 = si; x < merge.length; x++, idx1++) {
            arr[idx1] = merge[x];
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei)
            return;
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void mergeSort(int[] arr, int n) {
        // Write your code here.
        divide(arr, 0, n - 1);
    }
}