package twodarrays;

// Given a 2D array of n rows and m columns, return the sum of elements along the range of row
// and column specified.
import java.util.*;
class arr3{
    
    static void add(int [][]arr,int rowstart,int rowend,int colstart,int colend,int c,int r)
    {
        if(colstart<0 || colend>=c || rowstart<0 || rowend>=r ||rowstart>rowend || colstart>colend)
        {
        System.out.print("invalid range !");
        return;
        }
        int sum=0;
        for(int i=rowstart;i<=rowend;i++){
            for(int j=colstart;j<=colend;j++){
                sum+=arr[i][j];
            }
        }
        System.out.print(sum);
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
        System.out.print("enter the range row start and row end :");
        int rowstart=sc.nextInt();
        int rowend=sc.nextInt();
        System.out.print("enter the range col start and col end :");
        int colstart=sc.nextInt();
        int colend=sc.nextInt();
        
        add(arr,rowstart,rowend,colstart,colend,c,r);
    }
}
