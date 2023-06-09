package FunctionsAndMethods;

import java.util.Scanner;

public class Function_4 {
    public static void calcFactorial(int a) {
        if (a < 0) {
            System.out.println("Invalid Number");
        } else {
            int f = 1;
            for (int i = a; i >= 1; i--) {
                f = f * i;
            }
            System.out.println("Factorial is " + f);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();
        calcFactorial(a);
    }
}
