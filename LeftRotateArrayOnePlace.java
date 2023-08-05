package JavaProgram.TUC_Arrays;

import java.util.Arrays;

public class LeftRotateArrayOnePlace {
    static int[] leftRotateArrayInOnePlace(int arr[], int n){
        int temp = arr[0];
        for (int i = 1; i < n ; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int []array = {1,2,3,4,5};
        System.out.println(Arrays.toString(leftRotateArrayInOnePlace(array,5)));
    }
}
//With time complexity - O(N) and using this array we solve so space complexity is  - O(N ), even its giving already, but I am using it to solving
//If someone ask what is the extra space of using to solve this problem so the SC is -  O(1)
