//Write a function which takes in 2 numbers and returns the greater of those two
package FunctionsAndMethods;

import java.util.Scanner;

public class Function_7 {

    public static int greatestNum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int largest = greatestNum(a, b);
        System.out.println(largest);
    }
}
