package assement.condition;
import java.util.*;
public class c3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price :");
        int c=sc.nextInt();
        System.out.println("eneter the seling price :");
        int s=sc.nextInt();
        if(c<s){
            int pr=s-c;
            System.out.println("profit =" +pr);
        }
        else{
            int ls=c-s;
            System.out.println("loss =" +ls);
        }
    }
}
