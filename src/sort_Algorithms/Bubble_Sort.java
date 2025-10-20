package sort_Algorithms;

public class Bubble_Sort {
    /*
     * Quadratic time O(n^2)
     * small data set = ok
     * large data set = bad
     */

    /*
     * so sánh từng phần tử liền kề nhau.
     */

    public static int[] bubble_Sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int stemp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = stemp;
                }
            }

        }
        return arr;
    }

    // recursion Bubble_Sort_Algorithms
    public static int[] bubble_Sort_Recursion(int[] arr) {
        return sort_Recursion(arr, arr.length);
    }

    public static int[] sort_Recursion(int[] arr, int n) {
        if (n == 1) {
            return arr;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int stemp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = stemp;
            }
        }
        return sort_Recursion(arr, n - 1);

    }

    public static void main(String[] args) {
        System.out.println("Iterative bubble sort");
        int[] arr = { 5, 6, 1, 3, 7, 8, 2, 4, 10, 15, 14, 16, 23, 22, 44, 24, 18, 32, 31, 45 };
        bubble_Sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Recursion bubble sort");
        int[] arrRec = { 4, 1, 8, 3, 9, 2, 5, 7, 6 };
        bubble_Sort_Recursion(arrRec);
        for (int i : arrRec) {
            System.out.print(i + " ");
        }

    }

}
