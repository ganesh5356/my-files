package imp;

import java.util.Scanner;

public class checkingequalpartitionsuingprefixsum {
     static int prefsum(int []arr){
         int totsum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            totsum+=arr[i];
        }
        return totsum;
    }
    static boolean equlaparttion(int []arr){
        int totsum=prefsum(arr);
        int pref=0;
        for(int i=0;i<arr.length;i++){
            pref+=arr[i];
            int suffixsum=totsum-pref;
            if(pref==suffixsum){
                return true;
            }
        }
        return false;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size :");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean ans=equlaparttion(arr);
        System.out.print("there is "+ ans + " equal partition");
        
    }
}
