// Given an array sorted in increasing order, return an array of squares of each number sorted
// in increasing order.
import java.util.Scanner;

public class demo6 {
    static int [] sortarrsquare(int []arr){
        int n=arr.length;
        int []ans=new int[n];
        int l=0;int r=n-1;int k=n-1;
        while(l<=r){
            if(Math.abs(arr[l]) > Math.abs(arr[r])){
                ans[k--]=arr[l]*arr[l];
                l++;
            }else{
                ans[k--]=arr[r]*arr[r];
                r--;
            }
        }
        return  ans;

    }
    static  void printarr(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static  void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void reverse(int []arr){
        int n=arr.length;
        int l=0,r=n-1;
        while(l<r){
            swap(arr,l,r);
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size :");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int []ans=sortarrsquare(arr);
        // reverse(ans);
        printarr(ans);
        
    }
}
// [-5, -2, -1, 0, 4, 6]