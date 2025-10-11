package leetCode_String;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LeetCode_344_ReverseString {
    /*
     * Write a function that reverses a string. The input string is given as an
     * array of characters s.
     * Example 1:
     * 
     * Input: s = ["h","e","l","l","o"]
     * Output: ["o","l","l","e","h"]
     *
     * Example 2:
     * 
     * Input: s = ["H","a","n","n","a","h"]
     * Output: ["h","a","n","n","a","H"]
     */

    // sử dụng vòng lặp for
    public void reverseString2(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char stemp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = stemp;

        }

    }

    // sử dụng dệ quy _ recursion
    public static void reverses(char[] c, int i, int j) {
        if (i < j) {

            char stemp = c[i];
            c[i] = c[j];
            c[j] = stemp;
            reverses(c, i + 1, j - 1);
        }
    }

    public static void reverseString(char[] s) {
        reverses(s, 0, s.length - 1);
    }

    // test main
    public static void main(String[] args) {
        char[] c = { '1', '2', '3', '4', '5', '6', '7' };
        reverseString(c);
        System.out.println(new String(c));

    }

}