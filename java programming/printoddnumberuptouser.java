
import java.util.Scanner;

public class printoddnumberuptouser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
        //1,3,5,7,9...n
        for(int i=1;i<=2*n-1;i+=2){
            System.out.print(i +",");
        }
System.out.println();
        //4,7,10,13,16...n
        for(int i=4;i<=3*n+1;i+=3){
            System.out.print(i +",");
        }

        //best method compare to above
        System.out.println();
        int a=4;int diff=3;
        for(int i=1;i<=n;i++){
            System.out.print(a+",");
            a+=diff;
        }
        
    }
}
