// Given an array of size n, find the total number of occurrences of given number x.
import java.util.Scanner;

public class demo2 {
    static void occurance(int []arr,int k){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k)
            ans++;
        }
        System.out.print(ans);
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size :");
        int n=sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the number :");
        int k=sc.nextInt();
        occurance(arr, k);
    }
}
