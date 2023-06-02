//Print this Pattern
// * * * * *
// * * * * *
// * * * * *
// * * * * *
package PatternPrograms;

/**
 * Pattern1
 */

// Outer Loop is used for printing Rows
public class Pattern1 {

    public static void main(String[] args) {
        int row = 4;
        int column = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}