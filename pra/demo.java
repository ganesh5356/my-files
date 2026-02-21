import java.util.*;

class demo{
    static  void swap(int []arr,int i,int j){
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }
    static void rev(int []arr){
        int i=0;int j=arr.length-1;
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    static void rever(int [] arr,int i,int j){
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    static void rotate(int []arr,int k){
        int n=arr.length;
        k=k%n;
        rever(arr,0,n-k-1);
        rever(arr, n-k, n-1);
        rever(arr, 0, n-1);
        
    }
    static void printarr(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the array size :");
    int n=sc.nextInt();
    // System.out.print("enter the 2nd number :");
    // int s=sc.nextInt();
    // swap(n,s);
    int [] arr=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    // System.out.print("enter the k :");
    // int k=sc.nextInt();
    // rotate(arr,k);
    rev(arr);
    printarr(arr);
    } 
}