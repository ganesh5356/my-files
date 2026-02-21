package assessment2.loops;
import java.util.*;
public class l2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter n numbers :");
        int a=sc.nextInt();
        int sum=0;
        
        for(int i=1;i>0;i++){
            sum=sum+a%10;
            a=a/10;
            } 
            System.out.println(sum);
    }
    
}
