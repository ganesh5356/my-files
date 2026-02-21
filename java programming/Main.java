import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int dig=n%10;
            if(dig%2==0){
                sum=sum+dig;
               
            }
            n=n/10;
        }
        System.out.println(sum);
         
        
}
}

