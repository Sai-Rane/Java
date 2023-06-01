//Checking whether a number is odd or even
package ConditionalStatements;

import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        // % Modulo opeartor gives us the Remainder
        if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
