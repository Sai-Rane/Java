package Arrays;

import java.util.Scanner;

public class Array_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        // Taking input from User
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // For displaying array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
