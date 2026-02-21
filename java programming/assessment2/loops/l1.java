package assessment2.loops;
import java.util.*;
public class l1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n1=1,n2=0;
        int sum=0;
        if(a<=0)System.out.println("invalid");
        while(sum<a){
        int n3=n1+n2;
        n1=n2;
        n2=n3;
        sum++;
        System.out.print(n3+" ");
        }
        }
        
    
}
