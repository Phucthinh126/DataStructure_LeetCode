package leetCode;

import java.sql.Array;
import java.util.Arrays;

public class LeetCode_34_searchRange {
    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/?envType=problem-list-v2&envId=binary-search

    /*
     * Example 1:
     * 
     * Input: nums = [5,7,7,8,8,10], target = 8
     * Output: [3,4]
     * Example 2:
     * 
     * Input: nums = [5,7,7,8,8,10], target = 6
     * Output: [-1,-1]
     * Example 3:
     * 
     * Input: nums = [], target = 0
     * Output: [-1,-1]
     */

    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        if (nums.length == 0) {
            return new int[] { -1, -1 };
        }
        arr[0] = firstFind(nums, target);
        arr[1] = lastFind(nums, target);
        return arr;

    }

    // 5,7,7,8,8,10
    private static int firstFind(int[] nums, int target) {
        int index = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                index = mid;
            }
            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }

    private static int lastFind(int[] nums, int target) {
        int index = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                index = mid;
            }
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 8, 8, 8, 10 };
        int[] result = searchRange(arr, 8);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}