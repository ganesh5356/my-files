package imp;

import java.util.Scanner;

public class mularr {
    static void mul(int[][]arr,int r1,int c1,int[][]arr2,int r2,int c2){
        if(r1!=c2){
            System.out.print("not possible !");
            return;
        }
        int [][]ans=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    ans[i][j]+=arr[i][k]*arr2[k][j];
                }
            }
        }
        printarr(ans);
    }
    static void printarr(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("enter the no. of rows & columns of matrix 1 :");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int [][]arr=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("enter the no. of rows & columns of matrix 2 :");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int [][]arr2=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("multiplication matrix is :");
        mul(arr, r1, c1, arr2, r2, c2);

    }
}
