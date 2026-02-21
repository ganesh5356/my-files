package recusions;
import java.util.Scanner;

public class sumofdig {
    static int s(int n){
        if(n>=0 && n<=9)
        return n;
        int d=n/10;
        int e=n%10;
        return d+e;
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(s(n));
    }
}
