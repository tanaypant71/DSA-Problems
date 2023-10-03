import java.util.*;
import java.io.*;

public class Solution {
    public static void reverseArray(ArrayList<Integer> arr, int m) {
        // Write your code here.
        // reversing the array after the given position i.e. 'm'
        // si = starting index
        // ei = ending index
        int si = m + 1;
        int ei = arr.size() - 1;
        for (int index = si; index < ei; index++) {
            Collections.swap(arr, index, ei);
            ei--;
        }

    }
}
