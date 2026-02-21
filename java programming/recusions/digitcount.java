package recusions;

import java.util.Scanner;

public class digitcount {
    static int cou(int n){
        if(n>=0 && n<=9)
        return  1;
        else return cou(n/10)+cou(n%10);
         
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(cou(n));
    }
}
