package arrays;

import java.util.Scanner;
// Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
//  Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor. 
// Leftmost and rightmost element cannot be a peak element.
public class a5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the "+n+" elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the answers is:");
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans)
            ans=arr[i];
        }
        System.out.println(ans);
        
    }
}
