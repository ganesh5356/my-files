// Given an integer array arr, return the number of consecutive sequences(subarrays) with
// odd sum.
import java.util.Scanner;

public class demo7 {
        public static  int countOddSumSubarrays(int[] arr) {
            int count = 0;
            int prefixSum = 0;
            int evenCount = 1;
            int oddCount = 0; 
            for (int num : arr) {
                prefixSum += num;
                if (prefixSum % 2 != 0) {
                    count += evenCount; 
                    oddCount++; 
                } else {
                    count += oddCount; 
                    evenCount++; 
                }
            }
            return count;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size :");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.print(countOddSumSubarrays(arr));
    }
}

