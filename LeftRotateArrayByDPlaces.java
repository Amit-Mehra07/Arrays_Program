package JavaProgram.TUC_Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//Given an Array with n elements, the task is to rotate the array to the left by D steps, where D is non negative

public class LeftRotateArrayByDPlaces {

static void leftRotateArrayByDPlaces(int[] arr, int n, int d){
    reverse(arr, 0, d - 1);
    reverse(arr, d, n - 1);
    reverse(arr, 0, n - 1);
}
static void reverse(int [] arr,int start, int end){
    while(start <= end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
public static void main(String[] args) {
        int []array = {1,2,3,4,5,6,7};
        System.out.println("Enter the number of places to rotate the array by:- ");
        Scanner sc = new Scanner(System.in);
        leftRotateArrayByDPlaces(array,array.length,sc.nextInt());
        for (int i = 0; i < array.length; i++) {
            System.out.println((array[i]));
        }
    }
}
