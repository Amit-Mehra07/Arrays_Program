package JavaProgram.TUC_Arrays;

public class LargestArray {
    public static void main(String[] args) {
        int[] arr = {1,5,9,4,7};
        int largest;
        largest = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
        if(arr[i]>largest){
        largest = arr[i];
}
        }
        System.out.println("This is the largest element in this Array - "+largest);
    }
}
/* this traversing solution is because it provides time complexity O(N)*/