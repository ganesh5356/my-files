
import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<n;i++){
            if(n%i==0){
            flag=true;
            break;
            }
        }
        if(n==1){
        System.out.println("number is neither prime nor composite ");
        }
        else if(flag==false){
        System.out.println("number is prime number");
        }
        else{
        System.out.println("number is a composite number ");
        }
    }
    
}
