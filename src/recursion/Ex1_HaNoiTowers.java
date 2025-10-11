package recursion;

public class Ex1_HaNoiTowers {
    /*
     * Ha Noi tower
     * n - so dia
     * A, B, C thu tu tuong ung cot 1, 2, 3
     */

    public static void HaNoiTowers(int n, char A, char B, char C) {

        if (n == 1) {
            System.out.println("Move disk " + n + " from " + A + " to " + C);
        } else {
            HaNoiTowers(n - 1, A, C, B);
            System.out.println("Move disk " + n + " from " + A + " to " + C);
            HaNoiTowers(n - 1, B, A, C);
        }

    }

    public static void main(String[] args) {
        HaNoiTowers(3, 'A', 'B', 'C');
    }

}