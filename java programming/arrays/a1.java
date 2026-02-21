package arrays;
// Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.
import java.util.Scanner;

class a1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the "+n+" of elements :");
        for(int i=0;i<n;i++){
            System.out.println("enter "+(i+1)+" elements:");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
          
            if(arr[i]>=0)System.out.println(arr[i]);
        }
    }
}
