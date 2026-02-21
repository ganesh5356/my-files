package imp;
import java.util.*;
class spiralmatrix
 {
    static void spiralmatrix(int [][]arr,int r,int c){
        int tr=0, br=r-1, lc=0, rc=c-1;
        int total=0;
        while(total<r*c){
            for(int j=lc;j<=rc && total<r*c;j++){
                System.out.print(arr[tr][j]+" ");
                total++;
            }
            tr++;
            for(int i=tr;i<=br  && total<r*c;i++){
                System.out.print(arr[i][rc]+" ");
                total++;
            }
            rc--;
            for(int j=rc;j>=lc  && total<r*c;j--){
                System.out.print(arr[br][j]+" ");
                total++;
            }
            br--;
            for(int i=br;i>=tr && total<r*c; i--){
                System.out.print(arr[i][lc]+" ");
                total++;
            }
            lc++;
            
        }
    }
    static void transpose(int [][]arr,int r,int c){
        int ans[][]=new int [c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
        printarr(ans);
    }
    static void printarr(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    static int [][] generatematrix(int  n){
        int [][]arr=new int [n][n];
        int tr=0, br=n-1, lc=0, rc=n-1;
        int total=1;
        while(total<=n*n){
            for(int j=lc;j<=rc && total<=n*n;j++){
                arr[tr][j]=total++;
            }
            tr++;
            for(int i=tr;i<=br  && total<=n*n;i++){
                arr[i][rc]=total++;
            }
            rc--;
            for(int j=rc;j>=lc  && total<=n*n;j--){
                arr[br][j]=total++;
            }
            br--;
            for(int i=br;i>=tr && total<=n*n; i--){
                arr[i][lc]=total++;
            }
            lc++;
        }
        return arr;
        
            
    }
   public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int r=sc.nextInt();
        // int c=sc.nextInt();
        // int [][]arr1=new int[r][c];
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         arr1[i][j]=sc.nextInt();
        //     }
        // }
        // System.out.println("spiral matrix is ");
        // spiralmatrix(arr1,r,c);
        // System.out.println();
        // System.out.println("transpose matrix is");
        // transpose(arr1,r,c);
        System.out.println("generated spiral matrix is ");
        int [][]m=generatematrix(n);
        printarr(m);
        
    }
}