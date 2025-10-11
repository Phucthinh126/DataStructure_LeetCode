package recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Demo1_TailRecursion {
    /*
     * Tail_Recursion - đệ quy đuôi
     */
    // recursion - tổng n số nguyên
    public static int sumNumber(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNumber(n - 1);
    }

    // Tail_Recursion
    public static int sumTailNumber(int n) {
        return sumTail(n, 0);
    }

    public static int sumTail(int n, int acc) {
        if (n == 0) {
            return acc;
        }
        return sumTail(n - 1, acc + n);
    }

    @Test
    public void test() {
        assertEquals(sumNumber(10), 55);
        assertEquals(sumTailNumber(10), 55);

    }

}
