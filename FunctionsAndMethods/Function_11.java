// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

package FunctionsAndMethods;

import java.util.Scanner;

public class Function_11 {
    public static void calculateFibo(int a) {
        int a1 = 0;
        int b1 = 1;
        System.out.println(a1 + " " + b1);
        // int c = b + a;
        for (int i = 0; i <= a; i++) {

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();
        calculateFibo(a);
    }
}
