package sort_Algorithms;

import java.util.Arrays;

public class Insert_Sort {
    /*
     * Quadratic time O(n^2)
     * small data set = ok
     * large data set = bad
     */
    /*
     * hoạt động bằng cách lặp qua từng phần tử của danh sách chưa sắp xếp và chèn
     * nó vào đúng vị trí trong phần đã sắp xếp
     */

    public static int[] insert_Sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;

    }

    // recursion insert sort
    public static int[] recursion_Insert_Sort(int[] arr) {
        return recursion_Sort(arr, arr.length);
    }

    public static int[] recursion_Sort(int[] arr, int n) {
        // base case
        if (n <= 1) {
            return arr;
        }
        recursion_Sort(arr, n - 1);
        int key = n - 1;
        int j = n - 2;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
        return arr;

    }

    /*
     * Ứng dụng Insert sort to sort char array
     * [G,K,L,A,J,I,Q,Z,C]
     */
    public static char[] insertSort_Char(char[] c) {
        for (int i = 1; i < c.length; i++) {
            char key = c[i];
            int j = i - 1;
            while (j >= 0 && c[j] > key) {
                c[j + 1] = c[j];
                j = j - 1;
            }
            c[j + 1] = key;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 3, 1, 5, 8 };
        int[] arrr = { 12, 11, 13, 5, 6 };
        int[] arrrr = { 12, 3, 1, 5, 8 };
        char[] c = { 'G', 'K', 'L', 'A', 'J', 'I', 'Q', 'Z', 'C' };

        insert_Sort(arr);
        insert_Sort(arrr);
        recursion_Insert_Sort(arrrr);
        insertSort_Char(c);
        System.out.println("Iterative insert sort");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrr));
        System.out.println("Recursion insert sort");
        System.out.println(Arrays.toString(arrrr));
        System.out.println("Insert sort char array");
        System.out.println(Arrays.toString(c));

    }
}
