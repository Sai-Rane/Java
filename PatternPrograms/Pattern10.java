// Print this Pattern
//Butterfly Pattern
// *             *
// * *         * * 
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *

package PatternPrograms;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 4;

        // Upper Half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "\t");
            }

            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" " + "\t");
            }

            // 2nd Part of Upper half
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println("");
        }

        // Printing Lower Half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "\t");
            }

            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" " + "\t");
            }

            // 2nd Part of Upper half
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println("");
        }
    }
}
