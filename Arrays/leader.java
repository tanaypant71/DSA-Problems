// public class leader {
//     void leaderInArray(int[] arr, int n){
//         for (int i = 0; i < n; i++) {
//             for (int j = i+1; j < n; j++) {
//                     if (arr[i] <= arr[j]) {
//                         break;
//                     }
//                     if (j == n) {
//                         System.out.println(arr[i] + " ");
//                     }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         leader lead = new leader();
//         int arr[] = new int[]{ 16, 17, 4, 3, 5, 2 };
//         int n = arr.length;
//         lead.leaderInArray(arr, n);
//     }    
// }

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class leader
{

/*Java Function to print leaders in an array */

void printLeaders(int arr[], int size) {
        int maxRight = arr[size - 1];
        List<Integer> leadersList = new ArrayList<>();

        leadersList.add(maxRight);

        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                leadersList.add(maxRight);
            }
        }

        // Reverse and print the leaders list
        Collections.reverse(leadersList);
        for (int leader : leadersList) {
            System.out.print(leader + " ");
        }
    }
/* Driver program to test above functions */
public static void main (String[]args)
	{
	  leader lead = new leader();
	  int arr[] = new int[]{16, 17, 4, 3, 5, 2};
	  int n = arr.length;
	  lead.printLeaders (arr, n);
	}

}