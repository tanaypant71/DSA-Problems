import java.util.*;
import java.io.*;

public class Solution {
    public static String encode(String message) {
        // Write your code here.
        StringBuilder sb = new StringBuilder();
        int n = message.length();
        for (int i = 0; i < n; i++) {
            char c = message.charAt(i);
            int count = 1;
            while (i + 1 < n && message.charAt(i + 1) == c) {
                count++;
                i++;
            }
            sb.append(c);
            sb.append(count);
        }
        return sb.toString();
    }
}