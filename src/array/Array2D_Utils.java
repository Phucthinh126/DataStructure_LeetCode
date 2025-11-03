package array;

import java.util.Arrays;

public class Array2D_Utils {

    // get number of element in array 2D
    public static int getSize(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count++;
            }
        }
        return count;
    }

    // get colums
    public static int[] getColumn(int[][] arr, int column) {
        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            if (column <= 0) {
                return new int[0];
            }
            if (column > 0 && column <= arr[i].length) {
                result[i] = arr[i][column - 1];
            }
        }
        return result;

    }

    // search
    public static boolean search(int[][] arr, int target) {
        boolean find = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    find = true;
                }
            }
        }
        return find;
    }

    // print data of array 2D
    public static String toString(int[][] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result += arr[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }

    // sum two matrix
    public static int[][] sumMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[0][0];
        if (matrix1 == null || matrix2 == null || matrix1.length == 0 || matrix2.length == 0) {
            return result;

        }
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length
                && matrix1.length == matrix1[0].length && matrix2.length == matrix2[0].length) {
            result = new int[matrix1.length][matrix1[0].length];
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

        }
        return result;
    }

    // matrix with constant
    public static int[][] matrixWConstant(int[][] matrix, int constant) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = constant * matrix[i][j];
            }
        }
        return matrix;
    }

    // Matrix multiplication - nhân 2 ma trận
    public static int[][] matrixMultipcation(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[0][0];
        if (matrix1[0].length == matrix2.length) {
            int row1 = matrix1.length;
            int column2 = matrix2[0].length;
            int row2 = matrix2.length;
            result = new int[row1][column2];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    for (int k = 0; k < row2; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = { { 2, 4, 8, 7 },
                { 2, 5 },
                { 3, 6, 1, 9 } };
        int[][] matrix1 = { { 3, 4, 7 }, { 3, 1, 5 }, { 4, 2, 5 } };
        int[][] matrix2 = { { 11, 8, 45 }, { 23, 9, 4 }, { 4, 8, 4 } };

        int[][] matrix3 = { { 2, 3, 4 }, { 1, 0, 0 } };
        int[][] matrix4 = { { 0, 1000 }, { 1, 100 }, { 0, 10 } };
        System.out.println("Size of arr:  " + getSize(arr));
        System.out.println("-----------------------");
        System.out.println("Get column 3: ");
        System.out.println(Arrays.toString(getColumn(arr, 3)));
        System.out.println("------------------------");
        System.out.println("Search 5: " + search(arr, 5));
        System.out.println("Search 11: " + search(arr, 11));
        System.out.println("------------------------");
        System.out.println("Print array:");
        System.out.println(toString(arr));
        System.out.println("--------------------------");
        System.out.println("Sum two matrix: ");
        System.out.println(toString(sumMatrix(matrix1, matrix2)));
        System.out.println("----------------------");
        System.out.println("matrix Multipcation with constant");
        System.out.println(toString(matrixWConstant(matrix1, 5)));
        System.out.println("------------------------------------");
        System.out.println("matrix Multipcation");
        System.out.println(toString(matrixMultipcation(matrix3, matrix4)));
    }

}