// Q3 - Given an array arr[] and an integer K where K is smaller than size of array, the task is to
// find the Kth smallest element in the given array. It is given that all array elements are
// distinct.

import java.util.*;
class a3{
    static void smaller(int []arr,int k){
        Arrays.sort(arr);
        System.out.print("sorted array is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        int ans=arr[k-1];
        System.out.println(k+" smallest value is :"+ans);
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the k :");
        int k=sc.nextInt();
        smaller(arr,k);
    }
}