// Find the maximum & minimum number in an array of integers. 
package Arrays;

public class Array_5 {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 10, 3, 4 };
        int max = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum Number " + max);
        System.out.println("Minimum Number " + min);
    }
}
