//Print this Pattern
//       *
//     * *
//   * * *
// * * * *
package PatternPrograms;

public class Pattern5 {
    public static void main(String[] args) {
        int r = 4;
        // outer loop
        for (int i = 1; i <= r; i++) {
            // inner loop to print space
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }

            // Another inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
