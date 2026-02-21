package imp;

import java.util.*;
class revspiralmatrix{
    static void spiral(int [][]arr,int r,int c){
        int tr=0,br=r-1,lc=0,rc=c-1;
        int tot=0;
        while(tot<r*c){
            for(int i=tr;i<=br && tot<r*c;i++){
                System.out.print(arr[i][lc]+" ");
                tot++;
            }
            lc++;
            for(int j=lc;j<=rc && tot<r*c;j++){
                System.out.print(arr[br][j]+" ");
                tot++;
            }
            br--;
            for(int i=br;i>=tr && tot<r*c;i--){
                System.out.print(arr[i][rc]+" ");
                tot++;
            }
            rc--;
            for(int j=rc;j>=lc && tot<r*c;j--){
                System.out.print(arr[tr][j]+" ");
                tot++;
            }
            tr++;
        }
        
    }
    static int [][]gen(int n){
        int [][]arr=new int [n][n];
        int tr=0,br=n-1,lc=0,rc=n-1;
        int tot=1;
    while(tot<=n*n){
            for(int i=tr;i<=br && tot<=n*n;i++){
                arr[i][lc]=tot++;
            }
            lc++;
            for(int j=lc;j<=rc && tot<=n*n;j++){
                arr[br][j]=tot++;
            }
            br--;
            for(int i=br;i>=tr && tot<=n*n;i--){
                arr[i][rc]=tot++;
            }
            rc--;
            for(int j=rc;j>=lc && tot<=n*n;j--){
                arr[tr][j]=tot++;
            }
            tr++;
        }
        return arr;
        
    }
     static void printarr(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        spiral(arr,r,c);
        System.out.println();
        System.out.println("enter the array size :");
        int n=sc.nextInt();
        int [][]a=gen(n);
        printarr(a);
    }
}
