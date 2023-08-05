package JavaProgram.TUC_Arrays;
//Remove duplicate fm sorted Array -  this is an optimal solution. known as two pointer approach
public class RemoveDuplicateArray {
    static int removeDuplicate(int[] arr, int n){
        int i = 0;
        for (int j = 1; j < n; j++) {
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }return i+1;

    }

    public static void main(String[] args) {
        int []array = {1,1,2,2,2,3,4,4,4,5,5,5,5,5,6,7,7};
        System.out.println("These are duplicate elements in array -> "+removeDuplicate(array,17));
    }
}
