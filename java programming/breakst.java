
import java.util.Scanner;

public class breakst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number :");
        int n=sc.nextInt(); // enterning how many input required....
        System.out.print("enter "+n+"of ele :");
        boolean flag=false;
        int a;
        for(int i=1;i<=n;i++){
             a=sc.nextInt();
            do { 
                if(a%2==0)flag=true;
                break;
            } while (n>0);
            int b=a;
            if(flag==true)System.out.println(+"is the first even number");
        }
        
}
}
