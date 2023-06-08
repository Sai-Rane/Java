//Write a function to add 2 numbers and return the sum

package FunctionsAndMethods;

import java.util.Scanner;

public class Function_3 {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to Add");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("Addition is " + sum);
    }
}
