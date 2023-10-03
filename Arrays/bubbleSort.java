import java.util.* ;
import java.io.*; 

public class Solution {
    
    public static void bubbleSort(int[] arr, int n) {   
        // Write your code here.
        
        // Outer loop for the number of passes (n-1 passes for n elements)
        for (int i = 0; i < n - 1; i++) {
            
            // Inner loop for comparisons and swaps
            for (int j = 0; j < n - 1 - i; j++) {
                
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
