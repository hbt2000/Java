package Javanine;

public class ArraySum {
    public static void main(String[] args) {
        int[][] arr = { { 6, 3}, { 1, -8 }, { 3, 12 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][0] += arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("sum of row " +  (i + 1) + " is " +arr[i][0]);
        }
    }
}
