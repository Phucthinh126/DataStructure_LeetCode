package leetCode;

public class LeetCode_35_SearchInsertPosition {
    /*
     * https://leetcode.com/problems/search-insert-position/?envType=problem-list-v2
     * &envId=binary-search
     */
    /*
     * Example 1:
     * 
     * Input: nums = [1,3,5,6], target = 5
     * Output: 2
     * Example 2:
     * 
     * Input: nums = [1,3,5,6], target = 2
     * Output: 1
     */

     // Sử dụng binary search
      public static int searchInsert(int[] nums, int target) {
        int low =0;
        int high =nums.length -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return low; // nếu không tìm thấy low chính là vị trí cần chèn vào 

    }
    public static void main(String[] args) {
        int [] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, 7));
    }

}
