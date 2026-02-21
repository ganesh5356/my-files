package internal_practise;

import java.util.Scanner;

public class fact {
    static void factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.print("factorial of a given "+n+" is "+fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number :");
        int n=sc.nextInt();
        factorial(n);
    }
}
