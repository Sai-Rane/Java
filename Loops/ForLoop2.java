//Printing Table of any Number
package Loops;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();
        int mul = 0;
        for (int i = 1; i <= 10; i++) {
            mul = a * i;
            System.out.println(mul);
        }
    }
}
