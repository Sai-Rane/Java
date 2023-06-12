// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
package FunctionsAndMethods;

import java.util.Scanner;

public class Function_9 {

    public static void calculatePower(int a, int b) {
        int pow = 1;
        for (int i = 1; i <= b; i++) {
            pow = pow * a;
        }
        System.out.println(pow);

        // You can also use the pow function
        // System.out.println(Math.pow(a, b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculatePower(a, b);
    }
}
