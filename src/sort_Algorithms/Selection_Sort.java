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
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }

    // using recursion
    public static int[] seclection_Sort_Recursion(int[] arr) {
        return swap(arr, 0, arr.length - 1);
    }

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
        int temp = arr[star];
        arr[star] = arr[minIndex];
        arr[minIndex] = temp;

        return swap(arr, star + 1, n);
    }

    // ứng dụng săp xếp chuỗi ký tự
    /*
     * [G,K,L,A,J,I,Q,Z,C]
     */
    public static char[] seclectionSort_Char(char[] c) {
        for (int i = 0; i < c.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < c.length; j++) {
                if (c[minIndex] > c[j]) {
                    minIndex = j;
                }
            }
            char temp = c[i];
            c[i] = c[minIndex];
            c[minIndex] = temp;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 1, 3 };
        // seclection_Sort(arr);
        seclection_Sort_Recursion(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        // test selection sort for char array
        char[] c = { 'G', 'K', 'L', 'A', 'J', 'I', 'Q', 'Z', 'C' };
        seclectionSort_Char(c);
        for (char d : c) {
            System.out.print(d + " ");
        }
    }
}
