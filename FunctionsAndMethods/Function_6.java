//Write a function to print the sum of all odd numbers from 1 to n
package FunctionsAndMethods;

import java.util.Scanner;

public class Function_6 {

    public static void calcSum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of all Odd Numbers is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        calcSum(n);
    }
}
