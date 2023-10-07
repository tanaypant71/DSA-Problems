public class Solution {
    public static int makeBeautiful(String str) {
        char[] ch = str.toCharArray();

        char[] req0 = str.toCharArray();
        char[] req1 = str.toCharArray();

        req0[0] = '0';
        req1[0] = '1';

        for (int i = 1; i < ch.length; i++) {
            if (req0[i - 1] == '0') {
                req0[i] = '1';
            } else {
                req0[i] = '0';
            }

            if (req1[i - 1] == '1') {
                req1[i] = '0';
            } else {
                req1[i] = '1';
            }
        }

        int c1 = 0, c2 = 0;
        for (int i = 0; i < ch.length; i++) {
            if (req0[i] != ch[i]) {
                c1++;
            }
            if (req1[i] != ch[i]) {
                c2++;
            }
        }
        return Math.min(c1, c2);
    }
}