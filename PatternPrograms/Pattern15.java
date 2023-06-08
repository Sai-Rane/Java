// Print this Pattern

//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5
package PatternPrograms;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        // n represents number of rows
        for (int i = 1; i <= n; i++) {

            // Printing spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
