package arrays;
// Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even
//  elements.

import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the "+n+" elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

       System.out.println("the answer is:");
        for (int array:arr){
            if(array<=0)System.out.println("invalid numbers");
            else
            if(array%2==0)
            System.out.println(array);
        }
    }
}
