package JavaProgram.TUC_Arrays;
import java.util.HashSet;
/*
You are given a function  -
int findCount(int [] arr, int length);
The function accepts an array, and its size, you need to find the number of distinct elements that are there in the array
and return the count of the number of distinct elements in the array.
*/
    public class DistinctElementsCount {
        public static int countDistinctElements(int[] arr) {
            HashSet<Integer> distinctElements = new HashSet<>();

            // Iterate over the array and add elements to the HashSet
            for (int i = 0; i < arr.length; i++) {
                distinctElements.add(arr[i]);
            }

            // Return the size of the HashSet, which represents the count of distinct elements
            return distinctElements.size();
        }

        public static void main(String[] args) {
//            int[] array = {1, 2, 3, 4, 2, 3, 1, 5, 6, 7, 8, 9, 7};
//            int [] array = {8,4,7,3,7,4,5,7,3,4,6,3,6,4,3};
            int [] array = {8,9,5,8,9,7,12};
            int distinctCount = countDistinctElements(array);
            System.out.println("Number of distinct elements: " + distinctCount);
        }
    }
