package JavaProgram.TUC_Arrays;

public class LinearSearch {
    static int linearSearch(int [] arr, int k){
        for (int i = 0; i < k; i++) {
            if(arr[i] == k){
                return  i;
            }
        }return -1;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        System.out.println("Index number of the element is - "+linearSearch(array,4));
    }
}
