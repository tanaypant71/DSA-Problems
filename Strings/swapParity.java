import java.io.*;
import java.util.*;

class swapParity {
    static String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }

    // Function to maximize the number
    public static String maximizedNumber(String num) {
        // String will be used to represent the
        // number in string
        String s = num;

        // Traversing the string
        for (int i = 0; i < s.length(); i++) {
            int maxi = s.charAt(i);
            int idx = i;

            // Check ith digit with all
            // the remaining unoperated
            // string to maximize the string
            for (int j = i + 1; j < s.length(); j++) {

                // If both the ith and
                // jth digit is odd
                if (maxi % 2 == 0 && (s.charAt(j)) % 2 == 0) {

                    // If the jth digit is
                    // greater than the ith digit
                    if (s.charAt(j) > maxi) {
                        maxi = s.charAt(j);
                        idx = j;
                    }
                }

                // If both ith and
                // jth digit is even
                else if (maxi % 2 == 1 && (s.charAt(j)) % 2 == 1) {

                    // If the jth digit is
                    // greater than ith digit.
                    if (s.charAt(j) > maxi) {
                        maxi = s.charAt(j);
                        idx = j;
                    }
                }
            }

            // Swap the largest digit to the right
            // of ith digit with ith digit
            s = swap(s, i, idx);
        }

        // Return the resulting string
        return s;
    }

    public static void main(String[] args) {
        String N = "3412";

        // Function call
        System.out.print(maximizedNumber(N));
    }
}
