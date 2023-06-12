// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered
package FunctionsAndMethods;

import java.util.Scanner;

public class Function_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Numbers you want to enter");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr);
        int positive = 0;
        int negative = 0;
        int zeroes = 0;
        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + " ");
            if (arr[i] > 0) {
                // System.out.println("positive" + positive++);
                positive++;
            } else if (arr[i] < 0) {
                // System.out.println("negative" + negative++);
                negative++;
            } else {
                // System.out.println("zeroes" + zeroes++);
                zeroes++;
            }
        }
        System.out.print("positive" + positive + "\n negative" + negative + "\n zeroes" + zeroes);
    }
}
