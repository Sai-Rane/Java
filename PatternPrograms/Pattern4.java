//Print this Pattern
// * * * *
// * * *
// * *  
// *  
package PatternPrograms;

public class Pattern4 {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
