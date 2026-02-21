// - Write a Java program to test the equality of two arrays.
import java.util.*;
class Main
{
    static boolean check(int []arr,int []arr_2){
    boolean flag=true;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=arr_2[i])
        flag = false;
    }
    return flag;
}
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the array size : ");
    int n=sc.nextInt();
    
    
    int []arr=new int[n];
    int []arr_2=new int [n];
    
    System.out.println("enter 1st array elements are :");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    
    System.out.println("enter 2nd array elements are :");
    for(int i=0;i<n;i++){
      arr_2[i]=sc.nextInt();
    }
    
    System.out.println("1st array elements :");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    
    System.out.println("2nd array elements :");
    for(int i=0;i<n;i++){
        System.out.print(arr_2[i]+" ");
    }
    System.out.println();
    
    boolean ans=check(arr,arr_2);
    System.out.print(ans);
    }
}


