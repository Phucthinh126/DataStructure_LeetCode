package sort_Algorithms;

import java.util.Arrays;

public class Merge_Sort {
    // merge sort
    public static int[] merge_Sort_Array(int left, int right, int[] arr) {
        // th dac biet
        if (left > right) {
            return new int[0]; // th dac biet
        }
        if (left == right) {
            int[] singleElement = { arr[left] }; // base case
            return singleElement;
        }

        // chia ra
        System.out.println("chia " + left + " - " + right);
        int mid = (left + right) / 2;
        int[] arr1 = merge_Sort_Array(left, mid, arr); // mang con thu 1
        int[] arr2 = merge_Sort_Array(mid + 1, right, arr);// mang con thu 2

        // tron vao
        int[] result = merge(arr1, arr2); // call method merge
        System.out.println("merge ket qua" + Arrays.toString(merge(arr1, arr2)));
        return result;

    }

    // ham merge hai mang vao nhau
    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length + arr2.length; // length mang ket qua
        int[] result = new int[n]; // mang ket qua co n element

        int i = 0, i1 = 0, i2 = 0;

        while (i < n) {
            if (i1 < arr1.length && i2 < arr2.length) { // a1, a2 # rong
                if (arr1[i1] <= arr2[i2]) {
                    result[i] = arr1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = arr2[i2];
                    i++;
                    i2++;
                }
            } else { // a1 or a2 rong
                if (i1 < arr1.length) { // a1 ok
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

    public static int[] sortArray(int[] nums) {
        return merge_Sort_Array(0, nums.length - 1, nums);
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 7, 8, 9 };
        // for (int i : merge(a, b)) {
        // System.out.print(i + " ");
        // }

        int[] c = { 1,5,3,2,8,7,6,4};
        System.out.println(Arrays.toString(sortArray(c)));
    }
}