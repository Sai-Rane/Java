// Take an array as an input from the user. Search for a given number x and print the index at which it occurs
package Arrays;

import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println(arr); // This prints the memory address of array

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array " + arr[i]);
        }
        System.out.println("Enter num you want to search in Array");
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println("Index is " + i);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Number not present in Array");
        }
    }
}
