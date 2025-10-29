package sort_Algorithms;

public class Quick_Sort {

    // ham quick sort
    public static void quick_Sort(int[] nums, int left, int right){
        // b1. Chọn khóa, 
        int key  = nums[(left+right)/2]; // chọn pivot ở giữa mảng

        // b2. Phân bố lại mảng theo khóa,  sử dụng partition_algorithms
        int k =partition(nums, left, right, key);
    }

    // method partition()
    // return pivot - để phân mảng ra làm hai
    public static int partition(int[] nums, int left,  int right, int key){
        int il = left; // start to left
        int ir = right; // start to right
        while (il <= ir) {
            // il bên trái chứa các phần tử nhỏ hơn key,
            // với il, đi tìm phần tử >= key để đổi chỗ
            while (nums[il] < key) {
                il++;
            }

            // 
        } 

    }
    
    
}