import java.util.Scanner;
 public class Ma{
    public static int  brute(int [][]arr,int l1,int r1,int l2,int r2){
            int sum=0;
            for(int i=l1;i<=l2;i++){
                for(int j=r1;j<=r2;j++){
                    sum+=arr[i][j];
                }
            }
            return sum;
        }
        static void prinarr(int [][]arr){
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
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("enter the l1 r1 l2 r2:");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        System.out.print(brute(arr,r1,l1,r2,l2));
    }
} 