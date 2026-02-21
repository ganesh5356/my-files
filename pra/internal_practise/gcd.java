package internal_practise;

import java.util.Scanner;

public class gcd {
    static int GCD(int a,int b){
        if(b==0){
        return a;
        }
        return GCD(b,a%b);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the two numbers to find gcd :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("the gcd of "+a+" and "+b+" is "+GCD(a, b));
    }
}
