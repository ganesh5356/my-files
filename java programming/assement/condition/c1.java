package assement.condition;
import java.util.*;
public class c1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length :");
        int l = sc.nextInt() , b=sc.nextInt();
        if(l%2==0 && b%2==0){
            System.out.println("it is a square ");
        }
        else{
            System.out.println("it is a rectangle");
        }

    }
    
}
