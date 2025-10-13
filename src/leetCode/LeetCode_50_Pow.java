package leetCode;

public class LeetCode_50_Pow {
    /*
     * Topics: Math, recursion
     */
    /*
     * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
     * Example 1:
     * 
     * Input: x = 2.00000, n = 10
     * Output: 1024.00000
     * Example 2:
     * 
     * Input: x = 2.10000, n = 3
     * Output: 9.26100
     * Example 3:
     * 
     * Input: x = 2.00000, n = -2
     * Output: 0.25000
     * Explanation: 2-2 = 1/22 = 1/4 = 0.25
     */

    // Solution - Math
    public static double mathPow(double x, int n) {
        double result = 0.0;
        if (x > -100.0 && x < 100.0) {
            result = Math.pow(x, n);
        }
        return result;
    }

    // Solution - recursion
    // x^n = x^(n/2) * x(n/2) -- x^6 = x^3*x^3 (n la so chan)
    // x^5 = x^1*x^2*x^2

    public static double recPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        if (n % 2 == 0) {
            double r = recPow(x, n / 2);
            return x * r;
        }
        double r = recPow(x, (n - 1) / 2);
        return x * r * r;

    }

    public static void main(String[] args) {
        System.out.println(mathPow(2.00, 10));
        System.out.println(mathPow(2.100, 3));
        System.out.println(mathPow(2.00, -2));
        System.out.println();
        System.out.println(recPow(2.000, 3));
        System.out.println(recPow(2.100, 3));
        System.out.println(recPow(2.000, -2));

    }
}