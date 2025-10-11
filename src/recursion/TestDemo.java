package recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {
    @Test
    public void test() {
        // test fibonacci
        assertEquals(Demo.fibonacci(5), 5);
        assertEquals(Demo.fibonacci(6), 8);
        assertEquals(Demo.fibonacci(7), 13);

        // test factorial
        assertEquals(Demo.factorial(5), 120);
        assertEquals(Demo.factorial(6), 720);
        assertEquals(Demo.factorial(7), 5040);


    }
    // test main
    public static void main(String[] args) {
        // test printElement
        int [] arr = {2,6,8,3,7,8,2,3};
        System.out.println("Test printElement: ");
        Demo.printElement(arr, 2);
        System.out.println();
        System.out.println("Test printElement2: ");
        Demo.printElement2(arr, 7);

        // System.out.println(Demo.fibonacci(10));
        // System.out.println();
        // System.out.println(Demo.fibonacci2(10));
    }
}
