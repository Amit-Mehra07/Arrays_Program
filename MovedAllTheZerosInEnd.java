package JavaProgram.TUC_Arrays;
//we can also write an optimal solution with two pointer approach.
import java.util.Arrays;

public class MovedAllTheZerosInEnd {
    /*
    static int[] movedAllTheZerosInEnd(int[] arr, int n) {: This line defines a static method named movedAllTheZerosInEnd,
    which takes an integer array arr and an integer n as parameters and returns an integer array.
     */
    static int[] movedAllTheZerosInEnd(int[] arr, int n) {
        int[] temp = new int[n];//Creates a new integer array named temp with the same length as the original array.
                               // This array will be used to store the modified elements.
        int index = 0;
        // Copy non-zero elements to the temporary array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }
        // Fill the remaining positions with zeros
        while (index < n) {
            temp[index] = 0;
            index++;
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 0, 3, 0, 5, 0, 6, 7};
        System.out.println(Arrays.toString(movedAllTheZerosInEnd(array, array.length)));
    }
}
/*
Created a temporary array temp with the same length as the original array.
Introduced an index variable to keep track of the position to insert non-zero elements into the temp array.
Modified the loop to copy non-zero elements from the original array to the temp array, incrementing the index variable accordingly.
After copying the non-zero elements, filled the remaining positions in the temp array with zeros.
Returned the temp array instead of the original array.
*/