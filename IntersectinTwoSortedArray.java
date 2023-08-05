package JavaProgram.TUC_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class IntersectinTwoSortedArray {



        public static int[] IntersectionOfSortedArrays(int[] arr1, int[] arr2) {
            int n1 = arr1.length;
            int n2 = arr2.length;

            // Create a list to store the intersection of the arrays
            List<Integer> intersectionList = new ArrayList<>();

            int i = 0; // Pointer for arr1
            int j = 0; // Pointer for arr2

            // Traverse both arrays and find the common elements
            while (i < n1 && j < n2) {
                if (arr1[i] < arr2[j]) {
                    i++;
                } else if (arr2[j] < arr1[i]) {
                    j++;
                } else {
                    // If both elements are equal, add to the intersection
                    intersectionList.add(arr1[i]);
                    i++;
                    j++;
                }
            }

            // Convert the intersection list to an array
            int[] intersectionArr = new int[intersectionList.size()];
            for (int k = 0; k < intersectionArr.length; k++) {
                intersectionArr[k] = intersectionList.get(k);
            }

            return intersectionArr;
        }

        public static void main(String[] args) {
            int[] arr1 = {1, 3, 4, 5, 7};
            int[] arr2 = {2, 3, 5, 6, 8, 10};

            int[] intersection = IntersectionOfSortedArrays(arr1, arr2);
            System.out.println("Intersection of the arrays: " + Arrays.toString(intersection));
        }
    }

