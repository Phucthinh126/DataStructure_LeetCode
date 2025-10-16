package search_Algorithms;

public class Problems_SearchALgorithm {
    /*
     * các vấn đề nguồn: https://www.geeksforgeeks.org/dsa/searching-algorithms/
     */

    /*
     * Largest element in array:
     * https://www.geeksforgeeks.org/dsa/program-to-find-largest-element-in-an-array
     * Input: arr[] = [20, 10, 20, 4, 100]
     * Output: 100
     */

    // Iterative Approach
    public static int largest(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Recursion Approach
    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index]; // base case
        }
        int max = findMax(arr, index + 1); // tìm max
        if (arr[index] > max) {
            return arr[index];
        } else {
            return max;
        }
    }

    public static int recursionLargest(int[] arr) {
        return findMax(arr, 0);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 4, 9, 12, 43, 21, 78, 32, 24 };
        int[] arr2= {4,5,1,9,6,3};
        System.out.println("Largest: " + largest(arr));
        System.out.println("Find Largest using recursion: " + recursionLargest(arr2));
    }
}
