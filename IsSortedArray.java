package JavaProgram.TUC_Arrays;

public class IsSortedArray {
    static boolean isSorted(int[] arr,int n){
        for (int i = 1; i < n ; i++) {
            if(arr[i] <= arr[i-1]){// If we change the condition here with >= then it will convert in Ascending order sorted array.
            }
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int [] array = {9,8,7,10,5,2,1};
        System.out.println("Is my Array sorted? "+isSorted(array,7));
    }
}
// O(N) its time complexity because here we used single passing
