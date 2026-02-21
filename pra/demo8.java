// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
// find two numbers such that they add up to a specific target number.
// Return the indices of the two numbers added by one. Return -1 if pair does not exist.
import java.util.Scanner;

public class demo8 {
    static String showpos(int[]arr,int t){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==t)
                    return i+ " "+j;
            }
        }
        return "-1";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size :");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the target value :");
        int t=sc.nextInt();
        System.out.print(showpos(arr, t));
    }
}
