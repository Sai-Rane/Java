// Print this Pattern
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

package PatternPrograms;

public class Pattern8 {
    public static void main(String[] args) {
        int r = 5;
        int number = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + "\t");
                number++;
            }
            System.out.println("");
        }
    }
}
