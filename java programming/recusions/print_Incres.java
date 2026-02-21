package recusions;

import java.util.Scanner;

public class print_Incres {
    static void pi(int n){
        if(n==1){
        System.out.print(n+" ");
        return;
    }
        pi(n-1);
        System.out.print(n+" ");
        
    }
    static void pd(int n){
        if(n==1){
        System.out.print(n+" ");
        return;
    }
        System.out.print(n+" ");
        pd(n-1); 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // System.out.println("elements in ascending order ");
        // pi(n);
        System.out.println();
        System.out.println("elements in descending order ");
        pd(n);
    }
}
