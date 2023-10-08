import java.util.*;
import java.io.*;

public class Solution {

    public static int longestMountain(int arr[], int n) {
        // Write your code here.
        int res = 0;
        if (n < 3) {
            return 0;
        }
        int left = 0;
        int right = 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                left = i - 1;
                right = i + 1;

                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }
                res = Math.max(res, right - left + 1);
            }
        }
        return res;
    }

}
