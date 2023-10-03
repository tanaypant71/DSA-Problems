import java.io.*;
import java.util.* ;

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
