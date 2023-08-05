package JavaProgram.TUC_Arrays;

import java.util.Arrays;

public class MovedAllZero {
    // Function to move all zeros to the end of the array
    static int[] movedAllZero(int[] arr, int n) {
        int j = -1;

        // Find the first occurrence of zero in the array
        for (int i = 0; i < n; i++) {
            /*
            In this loop, we iterate over the elements of the array arr. When a zero is encountered (arr[i] == 0),
             we store the index of that zero in the variable j and then immediately exit the loop using the break statement.
The purpose of this break statement is to find the first occurrence of a zero in the array.
 Once we find the first zero, we don't need to continue iterating through the remaining elements of the
 array, as we only need to move the zeros to the end while maintaining the order of the non-zero elements.
  By using break, we can efficiently stop the loop and proceed with the subsequent logic.
If we didn't use the break statement and allowed the loop to continue,
it would still find subsequent zeros and update the value of j, but it would be unnecessary and inefficient in terms of performance.
            */
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        // If no non-zero numbers found, return the array as it is
        if (j == -1) return arr;

        // Move non-zero numbers to the left of the array
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
        return arr;
    }

    // Helper function to swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to test the movedAllZero function
    public static void main(String[] args) {
        int[] array = {1, 2, 0, 3, 4, 0, 5, 0};

        // Print the array before and after moving zeros
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array after moving zeros: " + Arrays.toString(movedAllZero(array, array.length)));
    }
}
//Time complexity - O(N)
//Space complexity - O(1)