import java.util.*;
import java.io.*;

public class Solution {
    public static int minimumParentheses(String pattern) {
        // Write your code here.
        int open = 0, close = 0;
        // We only look for invalid pairs
        for (int i = 0; i < pattern.length(); i++) {
            // open brackets whenever possible
            if (pattern.charAt(i) == '(') {
                open++;
            } else {
                if (open == 0) {
                    close++;
                } else
                    open--;
            }
        }
        return (open + close);
    }
}