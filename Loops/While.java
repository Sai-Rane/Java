// initialization is done outside while loop as shown below
// int i=0;

// while(condition){
// do something
//increment is done inside loop
// }
package Loops;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++; // if you don't give this condition it will go in infinite loop
        }
    }
}
