// Q1 - Given an unsorted array arr[] of size N having both negative and positive integers, place
// all negative elements at the end of array without changing the order of positive elements
// and negative elements

// arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }

// import java.util.*;
// class a1{
//     static void sorted(int []arr){
//         Arrays.sort(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
        
//     }
//     public static void main (String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int []arr=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         sorted(arr);
//     }
// }

import java.util.*;

class a1 {
    static void rearrangeAndSort(int[] arr) {
        // List to store positive and negative numbers separately
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        
        // Separate positive and negative numbers
        for (int num : arr) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }
        
        // Sort positive numbers in ascending order
        Collections.sort(positive);
        
        // Sort negative numbers in descending order
        Collections.sort(negative, Collections.reverseOrder());
        
        // Merge the sorted positive and negative numbers into the original array
        int index = 0;
        
        // Add positive numbers to the array
        for (int num : positive) {
            arr[index++] = num;
        }
        
        // Add negative numbers to the array
        for (int num : negative) {
            arr[index++] = num;
        }
        
        // Print the final result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        // Input the size and the elements of the array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Read the elements of the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Call the function to rearrange and sort
        rearrangeAndSort(arr);
    }
}
