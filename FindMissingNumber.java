package JavaProgram.TUC_Arrays;

public class FindMissingNumber {
    public static int findMissingNumber(int []arr,int N){
int xor1 = 0;
int xor2 = 0;
int n = N-1;
        for (int i = 0; i < n; i++) {
             xor2 = xor2^arr[i];
             xor1 = xor1^(i+1);
        }
        xor1 = xor1^N;
        return xor1^xor2;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,9};
        int N = 9;
        System.out.println(findMissingNumber(array,N));
    }
}
//So this is the BestOptimal Solution with TC - O(N) and space complexity - O(1)
