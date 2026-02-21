package arrays;

import java.util.Scanner;
//. Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all
//  strings stored on odd indices of the array
public class a2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of strings you want :");
        int n=sc.nextInt();
        sc.nextLine();
        String []arr=new String[n];
        System.out.println("enter the "+n+" of strings:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }

        for(int i=0;i<arr.length;i+=2){
            System.out.println("the answers is:"+arr[i]);
        }
    }
}
