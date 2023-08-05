package JavaProgram.TUC_Arrays;

import static java.lang.Integer.MAX_VALUE;

public class SecondLargest {
static int secondLargest(int[] arr){
    int largest = arr[0];
    int slargest = -1;
    for(int i = 1; i< arr.length; i++)
    {
if(arr[i]>largest){
    slargest = largest;
    largest = arr[i];
} else if (arr[i]<largest && arr[i]>slargest) {
    slargest = arr[i];
}
    }
    return slargest;
}
static int secondSmallest(int[] arr, int n){
    int smallest = arr[0];
    int ssmallest = MAX_VALUE;
    for (int i = 1; i < n; i++) {
        if(arr[i]<smallest){
            ssmallest = smallest;
            smallest = arr[i];
        } else if (arr[i] != smallest && arr[i]<ssmallest) {
ssmallest = arr[i];
        }
    }
    return ssmallest;
}

    public static void main(String[] args) {
    int []a = {3,4,7,1,5,8,9};
        System.out.println("The second largest element is -> "+secondLargest(a));
        System.out.println("The second smallest element is -> "+secondSmallest(a,7));
    }
}
    /*If the current element is greater than the largest value, it
    updates slargest with the current largest value and largest with
    the current element. If the current element is smaller than
        largest but greater than slargest, it updates slargest
        with the current element. Finally, it returns the slargest value.*/