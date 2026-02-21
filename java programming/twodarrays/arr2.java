package twodarrays;

// Check if an element x exists in the given sorted matrix or not. Each row and column
// is sorted in itself. If it does not exist, return -1, else return its row and column index.
import java.util.*;
class arr2{
    static void search(int[][]arr,int x,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==x){
                System.out.print("row :"+ i+" col :"+j);
                return;
                }
            }
        }
    System.out.print("-1");
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the size of rows and columns:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("enter the x value to serach:");
        int x=sc.nextInt();
        
        search(arr,x,r,c);
    }
}
