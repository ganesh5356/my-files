package recusions;

import java.util.Scanner;

public class sum {
    static int prefsum(int n){
        if(n==1)return 1;
        if(n<=0)return -1;
        else
        return n+(prefsum(n-1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(prefsum(n));
    }
}
