package imp;
import java.util.*;
public class prefixsum {
    static void prefsum(int []arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
    }
    static void printarr(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size :");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        prefsum(arr);
        printarr(arr);
}
}
