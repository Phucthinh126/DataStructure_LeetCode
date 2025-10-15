package search_Algorithms;

public class Binary_Search {
    /*
     * 
     * Dùng cho mảng đã được sắp xếp
     * 
     */

    // Iterative binary search
    public static int iterativeBinarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    // Recursion Binary Search
    public static int recursionBinary(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return recursionBinary(arr, key, low, mid - 1);
        } else {
            return recursionBinary(arr, key, mid + 1, high);
        }
    }

    public static int recursionBinarySearch(int arr[], int key) {
        return recursionBinary(arr, key, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 8, 9, 12, 14, 17, 24, 26, 31 };
        System.out.println("Iterative Binary Search:");
        System.out.println("index of 26: " + iterativeBinarySearch(arr, 26));
        System.out.println("index of 5: " + iterativeBinarySearch(arr, 5));
        System.out.println("index of 61: " + iterativeBinarySearch(arr, 61));
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("Recursion Binary Search:");
        System.out.println("index of 17: " + recursionBinarySearch(arr, 17));
        System.out.println("index of 17: " + recursionBinarySearch(arr, 6));
        System.out.println("index of 17: " + recursionBinarySearch(arr, 71));

    }

}
