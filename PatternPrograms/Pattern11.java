// Print this Pattern

//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *
package PatternPrograms;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        // n represents number of rows
        for (int i = 1; i <= 5; i++) {

            // Printing spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" " + "\t");
            }

            // Printing stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println("");
        }
    }
}
