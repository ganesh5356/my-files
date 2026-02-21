package assessment2.loops;

import java.util.Scanner;

public class l6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int sp=n-1;int st=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=st;j++){
                System.out.print((char)(j+64)+" ");
            }
            sp--;
            st+=2;
            System.out.println();
        }
        int sp1=1;int st1=2*n-3;
        for(int i=1;i<n;i++){
            for(int j=1;j<=sp1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=st1;j++){
                System.out.print((char)(j+64)+" ");
            }
            sp1++;
            st1-=2;
            System.out.println();
        }
       
    }
}
