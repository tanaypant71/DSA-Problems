import java.io.*;
import java.util.*;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if(seen.contains(num))
            {
                return num;
            }
            seen.add(num);
        }
        return -1;
    }
}

// Another way to solve it in O(n)

import java.util.ArrayList;

public class Solution {

    public static int findDuplicate(ArrayList<Integer> arr) {

        // Write your code here.
        int n = arr.size();
        int actualsum = 0;
        int expectedsum = n * (n - 1) / 2;

        for (int i = 0; i < n; i++) {
            actualsum += arr.get(i);
        }
        return actualsum - expectedsum;
    }
}
