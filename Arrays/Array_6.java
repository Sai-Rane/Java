// Take an array of numbers as input and check if it is an array sorted in ascending order.
package Arrays;

public class Array_6 {
    public static void main(String[] args) {
        int arr[] = { 1, 10, 2, 5, 3 };
        // int asc = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // swapping logic
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
}
