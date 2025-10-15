package search_Algorithms;

public class Linear_Search {
    /*
     * linear_Search - tiềm kiếm tuyến tính
     * Một mảng số N, tìm phần từ x có trong mảng không
     * có trả ra index, không có return -1
     * Input: arr[] = [1, 2, 3, 4], x = 3
     * Output: 2
     */

    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /*
     * Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
     * Output: 8
     * Explanation: 3 is found at index 8.
     * Input: arr[] = [3, 5, 1, 2], key = 6
     * Output: -1
     * Explanation: There is no element that has value 6.
     */

    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 5, 1, 9, 6, 7 };
        System.out.println(linearSearch(arr, 5));
        System.out.println(linearSearch(arr, 35));

    }

}
