import java.util.*;
class twodarrayaddition{
    static void add(int[][]a,int r1,int c1,int[][]b,int r2,int c2){
        if(r1!=r2 || c1!=c2){
        System.out.print("enter matrix is wrong addition is not possible !");
        return;
        }
        
        int[][]s =new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                s[i][j]=a[i][j]+b[i][j];
            }
        }
        printarr(s);
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
        System.out.print("enter the size of matrix 1 as number of rows  :");
        int r1=sc.nextInt();
        System.out.print("enter the size of matrix 1 as number of columns :");
        int c1=sc.nextInt();
        int [][]a=new int [r1][c1];
        for(int i=0;i<r1;i++){
            System.out.print("enter the "+i+" row values :");
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.print("enter the size of matrix 2 as number of rows  :");
        int r2=sc.nextInt();
        System.out.print("enter the size of matrix 2 as number of columns :");
        int c2=sc.nextInt();
        int [][]b=new int [r2][c2];
        for(int i=0;i<r1;i++){
            System.out.print("enter the "+i+" row values :");
            for(int j=0;j<c1;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("original matrix 1:");
        printarr(a);
        System.out.println("original matrix 1:");
        printarr(a);
        System.out.println("matrix after adding matrix 1 and 2 :");
        add(a,r1,c1,b,r2,c2);
    }
}