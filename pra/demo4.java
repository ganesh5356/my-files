// Given an array arr[] of size n, find the first repeating element. The element should occur more than
// once and the index of its first occurrence should be the smallest. If no repeating element exists, print -1.
import java.util.Scanner;

public class demo4 {
    static int firstrepeatvalue(int []arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j])
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size  :");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    System.out.println(firstrepeatvalue(arr));
    }
}
