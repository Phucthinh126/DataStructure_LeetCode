package sort_Algorithms;

import java.util.Arrays;

public class Merge_Sort_Algorithms {
    // bro code

    // merge sort function
    public static void merge_Sort(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
        }

        int middle = length / 2;
        int[] left_Array = new int[middle];
        int[] right_Array = new int[length - middle];

        int i = 0; // left array
        int j = 0; // right array
        for (; i < length; i++) {
            if (i < middle) {
                left_Array[i] = nums[i];
            } else {
                right_Array[j] = nums[i];
                j++;
            }
        }
        merge_Sort(left_Array);
        merge_Sort(right_Array);
        merge(left_Array, right_Array, nums);

    }

    public static void merge(int[] left_Array, int[] right_Array, int[] nums) {
        int left_Size = nums.length / 2;
        int right_Size = nums.length - left_Size;
        int i = 0, l = 0, r = 0;
        while (l < left_Size && r < right_Size) {
            if (left_Array[l] < right_Array[r]) {
                nums[i] = left_Array[l];
                i++;
                l++;
            } else {
                nums[i] = right_Array[r];
                i++;
                r++;
            }
        }
        while (l < left_Size) {
            nums[i] = left_Array[l];
            i++;
            l++;
        }
        while (r < right_Size) {
            nums[i] = right_Array[r];
            i++;
            r++;
        }
    }

    public static void main(String[] args) {
        
        int[] arr = { 3, 6, 4, 2, 9, 1, 7, 8 };
        merge_Sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
