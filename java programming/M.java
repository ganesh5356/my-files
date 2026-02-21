import java.lang.*;
import java.util.*;




public class M{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int n=sc.nextInt();

        ///reverse of given number
        // int rev=0;
        // while(n!=0){
        //     rev=n%10;
        //     n=n/10;
        //     System.out.print(rev);
        // }
        // int rev=0;
        // while(n!=0){
        //     int last=n%10;
        //     rev=rev*10;
        //     rev=rev+last;
        //     n=n/10;
           
        // }
        // System.out.print(rev);
        

        int sum=1;
        if(n<0)System.out.println("zero");
        for(int i=1;n!=0;i++){
            sum=sum*n%10;
            
            n=n/10;
        }
        System.out.println(sum);

    }
}