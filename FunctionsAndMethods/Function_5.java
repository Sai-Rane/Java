//Enter 3 numbers and make a function to print their avg
package FunctionsAndMethods;

import java.util.Scanner;

public class Function_5 {

    public static void calcAverage(int a, int b, int c) {
        int avg = (a + b + c) / 3; // / operator returns quotient
        System.out.println(avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        calcAverage(a, b, c);
    }

}