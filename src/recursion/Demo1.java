package recursion;

public class Demo1 {

    // tính giai thừa
    public static int factorial(int n) {
        // 1. bai toan cơ sở
        if (n == 0) {
            return 1;
        }
        // 2. công thức quy nạp
        int fac = n * factorial(n - 1);
        return fac;
    }

    // fibonacci
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        System.out.println("[" + n + "]");

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // tối ưu đệ quy
    static int[] f = new int[10000];

    public static int fibonacci2(int n) {
        if (f[n] != 0) {
            return f[n];
        }
        System.out.println("[" + n + "]");

        if (n == 1 || n == 2) {
            f[1] = 1;
            f[2] = 1;
            return 1;
        }
        return f[n] = fibonacci2(n - 1) + fibonacci2(n - 2);

    }

    /*
     * in giá trị của một mảng số nguyên
     * ## in thứ tự phần tử từ 0 đến n-1
     */
    public static void printElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        printElement(arr, index + 1);
    }

    // in phần tử từ n-1 đến 0
    public static void printElement2(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        printElement2(arr, index - 1);

    }

}
