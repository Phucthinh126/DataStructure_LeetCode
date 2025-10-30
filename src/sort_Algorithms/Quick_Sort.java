package sort_Algorithms;

import java.util.Arrays;

public class Quick_Sort {

    // ham quick sort
    public static void quick_Sort(int[] nums, int left, int right) {
        // base case
        if (left >= right) {
            return;
        }
        // b1. Chọn khóa,
        int key = nums[(left + right) / 2]; // chọn pivot ở giữa mảng

        // b2. Phân bố lại mảng theo khóa, sử dụng partition_algorithms
        int pivot = partition(nums, left, right, key);
        System.out.println("left= " + left + " right= " + right + " key= " + key + " pivot= " + pivot);
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, left, right + 1)));
        System.out.println("------------------------------");
        // b3. chia mảng lại
        quick_Sort(nums, left, pivot - 1);
        quick_Sort(nums, pivot, right);
    }

    // method partition()
    // return pivot - để phân mảng ra làm hai
    public static int partition(int[] nums, int left, int right, int key) {
        int il = left; // start to left
        int ir = right; // start to right
        while (il <= ir) {
            // il bên trái chứa các phần tử nhỏ hơn key,
            // với il, đi tìm phần tử >= key để đổi chỗ
            while (nums[il] < key) {
                il++;
            }

            // ir bên trái chứa các phần tử lớn hơn key,
            // với ir đi tìm phần tử < key để đổi chỗ
            while (nums[ir] > key) {
                ir--;
            }
            if (il <= ir) {
                int temp = nums[il];
                nums[il] = nums[ir];
                nums[ir] = temp;
                il++;
                ir--;
            }
        }
        return il;

    }

    // ham sort array
    public static void quick_Sort_Algorithms(int[] arr) {
        quick_Sort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 6, 7, 8, 5, 4, 1, 2, 3 };
        System.out.println(Arrays.toString(arr));
        System.out.println("Start");
        quick_Sort_Algorithms(arr);
        System.out.println("Final");

        System.out.print(Arrays.toString(arr));
    }
}