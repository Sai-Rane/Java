package Strings;

public class String_3 {

    public static void main(String[] args) {
        // String Builder Class
        // Strings in Java are Immutable
        // In heap memory Objects are created and in stack variables are created

        // Syntax of declaring StringBuilder

        StringBuilder sb = new StringBuilder("John");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        // Set character at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert function
        sb.insert(0, "S");
        System.out.println(sb); // SJohn

        // .delete function
        sb.delete(2, 3);
        System.out.println(sb); // SJhn

        // append function
        System.out.println(sb); // SJhn
        sb.append("Mark");
        System.out.println(sb);

        // insert function
        sb.insert(0, 'S');
        System.out.println(sb); // SSPhnMark

        // delete function
        sb.delete(0, 5);
        System.out.println(sb); // Mark
    }
}