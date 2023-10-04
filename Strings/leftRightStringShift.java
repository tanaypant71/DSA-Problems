import java.util.*;
import java.io.*;

public class Solution {
    public static String leftRotate(String str, int d) {
        // Write you code here.
        int n = str.length();
        if (d > n) {
            d = d % n;
        }
        return str.substring(d, n) + str.substring(0, d);
    }

    public static String rightRotate(String str, int d) {
        // Write you code here.
        int n = str.length();
        if (d > n) {
            d = d % n;
        }
        return str.substring(n - d) + str.substring(0, n - d);
    }
}