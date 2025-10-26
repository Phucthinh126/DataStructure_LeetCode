package sort_Algorithms;

public class Merge_Sort {
    // merge sort
    public static int[] merge_Sort(int left, int right, int[] arr){
        // th dac biet
        if(L=left > right){
            return new int[0]; // th dac biet
        }
        if (left==right) {
            int[] singleElement  = {arr[left]}; // base case
        }
        
        // chia ra
        int mid = (left + right)/2;
        int[] arr1 = merge_Sort(left, mid, arr); // mang con thu 1
        int[] arr2 = merge_Sort(mid+1, right, arr);

        // tron vao

    }

    public static int[] sortArray(int [] nums){
        return merge_Sort(0, nums.length-1, nums);
    }
    
}