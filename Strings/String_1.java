package Strings;

public class String_1 {
    public static void main(String[] args) {
        String name = "John Martin";
        System.out.println("Char At " + name.charAt(0));

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        // For comparing 2 Strings we use .compareTo function
        // .compareTo function checks 3 cases
        // s1>s2 =>return +ve value
        // s1==s2 =>return 0
        // s1<s2 =>return -ve value

        String name1 = "John";
        String name2 = "John";
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else if (name1.compareTo(name2) > 0) {
            System.out.println("String 1 is greater");
        } else {
            System.out.println("String 2 is greater");
        }

        // Comparing Strings using the == operator
        if (name1 == name2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // Drawback of == opeartor while Comparing Strings is shown below
        // In Java Strings are Objects
        // In Java Strings are immutable(You cannot modify them )
        if (new String("John") == new String("John")) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // subString function - It takes beginning index and Ending index

        String sentence = "My name is John";
        System.out.println(sentence.substring(11, sentence.length()));
    }
}
