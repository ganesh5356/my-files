package imp;

import java.util.Scanner;
class rotate_2darr{
    static int [][]tranpose(int [][]arr,int r,int c){
        int ans[][]=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
    static void inplace(int [][]arr,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp=arr[j][i];
                arr[j][i]=arr[i][j];
                arr[i][j]=temp;
            }
        }
        printarr(arr);
    }
    static void inplaceant(int [][]arr,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        printarr(arr);
    }
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void rev(int []arr){
        int i=0,j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotate(int [][]arr,int n){
        // inplace(arr,n,n);
        for(int i=0;i<n;i++){
            rev(arr[i]);
        }
    }
    static void anticlk(int [][]arr,int r){
        for(int i=r-1;i>=0;i--){
            rev(arr[i]);
        }
    }
    static void printarr(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]arr=new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
    //    rotate(arr,r);
        System.out.println();
       inplaceant(arr, r, c);
       System.out.println();
       inplace(arr, r, c);
    // anticlk(arr, r);
    //    System.out.println("matrix after rotation ");
    //    printarr(arr);
        
    }
}
