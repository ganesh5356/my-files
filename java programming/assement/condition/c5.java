package assement.condition;
import java.util.*;
public class c5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the two numbers :"); 
        int a=sc.nextInt(), b=sc.nextInt();
        System.out.println(" eneter an operator \n 1. ( + ) \n 2. ( - ) \n 3. ( * ) \n 4. ( / ) \n  \n enetr your choice  : ");
        int cal =sc.nextInt();

        switch(cal){
            case 1:
            System.out.println(a+"+"+b +"="+(a+b));
            break;
            case 2:
            System.out.println(a+"-"+b +"="+(a-b));
            break;
            case 3:
            System.out.println(a+"*"+b +"="+(a*b));
            break;
            case 4:
            System.out.println(a+"/"+b +"="+(a/b));
            break;
            default :
            System.out.println("invalid choice");
        }
    }
    }

