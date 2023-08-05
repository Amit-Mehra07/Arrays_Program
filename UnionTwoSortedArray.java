package JavaProgram.TUC_Arrays;

import java.util.HashSet;
import java.util.Set;
//Change the var name with unionList to unionSet
import java.util.*;

public class UnionTwoSortedArray {
    public static int[] findUnion(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        // Create a list to store the union of the arrays
        Set<Integer> unionList = new TreeSet<Integer>();
        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2

        // Traverse both arrays and compare elements
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                unionList.add(arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                unionList.add(arr2[j]);
                j++;
            } else {
                // If both elements are equal, add one of them to the union
                unionList.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements from arr1, if any
        while (i < n1) {
            unionList.add(arr1[i]);
            i++;
        }

        // Add remaining elements from arr2, if any
        while (j < n2) {
            unionList.add(arr2[j]);
            j++;
        }

        // Convert the set to an array
        int[] unionArr = new int[unionList.size()];
        int k = 0;
        for (int num : unionList) {
            unionArr[k] = num;
            k++;
        }

        return unionArr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 4, 5, 7, 9};
        int[] arr2 = {2, 3, 4, 6, 7, 8, 10,11};
        int[] union = findUnion(arr1, arr2);
        System.out.println("Union of the arrays: " + Arrays.toString(union));
    }
}

   /* a TreeSet is used instead of a List to store the union of the arrays.
        A TreeSet is a set implementation that automatically sorts the
        elements in ascending order and eliminates duplicates.*/
