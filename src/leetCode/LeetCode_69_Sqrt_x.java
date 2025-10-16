package leetCode;

public class LeetCode_69_Sqrt_x {

    // https://leetcode.com/problems/sqrtx/description/?envType=problem-list-v2&
    // envId=binary-search

    /*
     * Example 1:
     * 
     * Input: x = 4
     * Output: 2
     * Explanation: The square root of 4 is 2, so we return 2.
     * Example 2:
     * 
     * Input: x = 8
     * Output: 2
     * Explanation: The square root of 8 is 2.82842..., and since we round it down
     * to the nearest integer, 2 is returned.
     * 
     */
    // solution
    // x =8 => can bac hai cua 8 = 2,83...
    // 0,1,2,3,4,5,6,7,8
    // low_____|_______x= high
    // _________mid
    // tim kiem nhi phan den mid*mid = x

    public static int sqrt(int x) {
        int low = 0;
        int high = x;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;
            if (square == x) {
                return mid;
            }
            else if (square > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high;

    }

    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println("Căn bậc 2 của " + x +" = " + sqrt(x));
    }

}