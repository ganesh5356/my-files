package assessment2.loops;
import java.util.*;
public class l3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number :");
        int a=sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
            
        }
        System.out.println(fact);
    }
    
}
