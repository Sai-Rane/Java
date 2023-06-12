package Arrays;

public class Array_2 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        // OR int marks[]=new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        System.out.println(marks[0]); // Error: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for
                                      // length 3
        System.out.println(marks[1]); // Error: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for
                                      // length 3
        System.out.println(marks[2]); // Error: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for
                                      // length 3
        // System.out.println(marks[3]); // Error:
        // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for
        // length 3

        // OR using for loop also you can print the elements of Array

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
