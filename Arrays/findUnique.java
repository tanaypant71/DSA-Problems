import java.util.Arrays;

public class Solution {

    public static int findUnique(int[] arr) {
        // Your code goes here
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}

// O(nlogn)
// Arrays.sort(arr);
// try{
// for (int i = 0; i < arr.length; i=i+2) {
// if(arr[i] != arr[i+1]){
// return arr[i];
// }
// }
// }
// catch(Exception e){
// return arr[arr.length-1];
// }
// return 0;
