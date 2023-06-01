package ConditionalStatements;

import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Numbers are Equal");
        } else if (a > b) {
            System.out.println("A is Greater");
        } else {
            System.out.println("B is Greater");
        }
    }
}
