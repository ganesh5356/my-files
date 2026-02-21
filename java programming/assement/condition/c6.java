package assement.condition;
import java.util.*;
public class c6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your marks :");
        int mar=sc.nextInt();
        if (mar>=90 || mar==100){
            System.out.println("your grade is A+");
        }
        else if (mar>=90 || mar==100){
            System.out.println("your grade is A+");
        }
        else if (mar>=80  || mar==90){
            System.out.println("your grade is A");
        }
        else if (mar>=70 || mar==80){
            System.out.println("your grade is B+");
        }
        else if (mar>=60 ||  mar==70){
            System.out.println("your grade is B");
        }
        else if (mar>=50 || mar==60){
            System.out.println("your grade is C");
        }
        else if (mar>=40 || mar==50){
            System.out.println("your grade is D");
        }
       else  if (mar>=30 || mar==40){
            System.out.println("your grade is E");
        }
        else{
            System.out.println("your grade is F");
        }
    }
}
