package leetCode;

import java.util.Arrays;

public class LeetCode_912_SortAnArray {
    /*
     * Example 1:
     * 
     * Input: nums = [5,2,3,1]
     * Output: [1,2,3,5]
     * Explanation: After sorting the array, the positions of some numbers are not
     * changed (for example, 2 and 3), while the positions of other numbers are
     * changed (for example, 1 and 5).
     * Example 2:
     * 
     * Input: nums = [5,1,1,2,0,0]
     * Output: [0,0,1,1,2,5]
     * Explanation: Note that the values of nums are not necessarily unique.
     */

    /*
     * using Selection, bubble, insert sort algorithms không thể do quá thời gian
     * Solution: merge sort
     */

    public static int[] sortArray(int[] nums) {
        return merge_Sort(0, nums.length - 1, nums);
    }

    public static int[] merge_Sort(int left, int right, int[] nums) {
        if (left > right) {
            return new int[0];
        }
        if (left == right) {
            int[] singleElement = { nums[left] };
            return singleElement;
        }
        int mid = (left + right) / 2;
        int[] arr1 = merge_Sort(left, mid, nums);
        int[] arr2 = merge_Sort(mid + 1, right, nums);
        int[] result = merge(arr1, arr2);
        return result;

    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length + arr2.length;
        int[] result = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < arr1.length && i2 < arr2.length) {
                if (arr1[i1] <= arr2[i2]) {
                    result[i] = arr1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = arr2[i2];
                    i++;
                    i2++;
                }
            } else {
                if (i1 < arr1.length) {
                    result[i] = arr1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = arr2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;
    }

}
