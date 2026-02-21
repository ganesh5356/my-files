

import java.util.Scanner;

public class l9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        int midd=n/2;
        boolean flag=false;
        if(n==0 || n==1)System.out.println(n+"false");
        else{
        for(int i=2;i<=midd;i++){
            if(n%i==0)
            flag=true;
            break;
    }
    if(flag==true)System.out.println(n+"false");
    else System.out.println(n+"true");

}
    }
}
