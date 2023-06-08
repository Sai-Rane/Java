// Print this Pattern

//      *
//    * * *
//   * * * * *
// * * * * * * *
// * * * * * * *
//   * * * *
//    * * *
//      *
package PatternPrograms;

public class Pattern16 {
    public static void main(String[] args) {
        int n = 4;

        // Printing Upper Half
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;

            // Printing spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" \t");
            }

            // Printing Upper half first part
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }

            // Printing Upper half second part
            for (int j = 2; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println("");
        }

        // Printing Lower half
        for (int i = n; i >= 1; i--) {
            int spaces = n - i;
            // Printing spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" " + "\t");
            }
            // Printing Lower half first part
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "\t");
            }

            // Printing Lower half second part
            for (int j = 2; j <= i; j++) {
                System.out.print("*" + "\t");
            }

            System.out.println("");
        }

    }
}
