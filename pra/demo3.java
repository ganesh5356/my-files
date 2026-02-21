// Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
// missing number from the first N integers. There are no duplicates in the list.
import java.util.Scanner;

public class demo3 {
    static void findmissing(int []arr,int n){
        int t=n*(n+1)/2;
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        int ans=t-sum;
        System.out.println("the missing value is : "+ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={1,2,3,5};
        int n=5;
        findmissing(arr,n);
    }
}
