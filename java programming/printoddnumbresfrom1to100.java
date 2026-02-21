
import java.util.Scanner;

public class printoddnumbresfrom1to100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            if(i%2==0) continue;
            System.out.println(i);
            
        }
    }
}
