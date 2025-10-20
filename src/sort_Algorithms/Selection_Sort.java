package sort_Algorithms;

public class Selection_Sort {
    /*
     * Quadratic time O(n^2)
     * small data set = ok
     * large data set = bad
     */
    // sử dụng vòng lặp
    // [5,2,4,6,1,3] ---> [1,2,3,4,5,6]
    // sử dụng seclection sort

    public static int[] seclection_Sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int step = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = step;
        }

        return arr;
    }

    // using recursion
    public static int[] swap(int[] arr, int star, int n) {
        if (star == n) {
            return arr;
        }
        int minIndex = star;

        for (int i = star + 1; i < arr.length; i++) {

            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        int stemp = arr[star];
        arr[star] = arr[minIndex];
        arr[minIndex] = stemp;

        return swap(arr, star + 1, n);
    }

    public static int[] seclection_Sort_Recursion(int[] arr) {
        return swap(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 1, 3 };
        // seclection_Sort(arr);
        seclection_Sort_Recursion(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
