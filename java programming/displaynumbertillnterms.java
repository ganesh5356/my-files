
import java.util.Scanner;

public class displaynumbertillnterms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
        //1,2,4,8,12...n
        int a=1,b=2;
        for(int i=1;i<=n;i++){
            System.out.print(a+",");
            a*=b;
        }
    }
}
