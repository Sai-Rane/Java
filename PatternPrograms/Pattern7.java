//Print this Pattern

// 1 2 3 4 5
// 1 2 3 4 
// 1 2 3
// 1 2
// 1 
package PatternPrograms;

public class Pattern7 {
    public static void main(String[] args) {
        int r = 5;
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
