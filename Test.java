import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("Addition");
        // Taking input from User using the Scanner class
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Addition is " + sum);
    }
}