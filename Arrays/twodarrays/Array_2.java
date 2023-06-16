package Arrays.twodarrays;

import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        // input
        // Outer loop is controlling rows and inner loop is controlling columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter a number you want to find in array");
        int num = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (num == numbers[i][j]) {
                    System.out.println("Index " + i + "" + j);
                } else {
                    System.out.println("Number not present in Array");
                }
            }
        }
    }
}
