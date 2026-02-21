package internal_practise;

import java.util.Scanner;

public class binsearch {
    static int bin(int []arr,int t,int low,int high){
        if(low>high)return -1;
        int mid=(low+high)/2;
        if(arr[mid]==t)return mid;
        else if(arr[mid]<t)
        return bin(arr, t,mid+1,high);
        else 
        return bin(arr, t, low, mid-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size :");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the target :");{
            int t=sc.nextInt();
        
        // int low=0;
        // int high=arr.length-1;
        System.out.print(bin(arr, t, 0, arr.length-1));
        }
    }
}
