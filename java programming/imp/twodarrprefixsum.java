package imp;

import java.util.*;
public class twodarrprefixsum
{
    // static int bruteforce(int [][]arr,int l1,int r1,int l2,int r2){
    //     int sum=0;
    //     for(int i=l1;i<=l2;i++){
    //         for(int j=r1;j<=r2;j++){
    //             sum+=arr[i][j];
    //         }
    //     }
    //     return sum;
    // }
    static int  brute(int [][]arr,int l1,int r1,int l2,int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    static void pre(int [][]arr){
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                arr[i][j]+=arr[i-1][j];
            }
        }
    }
    static int colummnwiseprefix(int [][]arr,int l1,int r1,int l2,int r2){
        int ans=0;
        pre(arr);
        int sum=0, up=0,left=0,leftup=0;
        sum=arr[l2][r2];
        if(r1>=1)
        left=arr[l2][r1-1];
        if(l1>=1)
        up=arr[l1-1][r2];
        if(l1 >=1 && r1>=1)
        leftup=arr[l1-1][r1-1];
        ans=sum-up-left+leftup;
        return ans;
    }
    static void pref(int [][]arr){
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
    }
    static int rowwiseprefix(int [][]arr,int l1,int r1,int l2,int r2){
        int sum=0;
        pref(arr);
        for(int i=l1;i<=l2;i++){
            if(r1>=1)
            sum+=arr[i][r2]-arr[i][r1-1];
            else
            sum+=arr[i][r2];
        }
        return sum;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int [][]arr=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		System.out.print("enter the range to l1 r1 l2 r2 :");
		int l1=sc.nextInt();
		int r1=sc.nextInt();
		int l2=sc.nextInt();
		int r2=sc.nextInt();
		System.out.print("the sum of "+ l1+","+r1+" and "+l2+","+r2+" is :");
		// System.out.print(colummnwiseprefix(arr, l1, r1, l2, r2));
		// System.out.println();
		System.out.print(brute(arr, l1, r1, l2, r2));
		
		}
	}

