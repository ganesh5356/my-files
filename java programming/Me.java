import java.util.*;
class Me {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n :");
        int n=sc.nextInt();
        
        
        int sp=n-1,st=1 ;
        for(int i=1;i<=n;i++){
            for(int j=1;i<=sp;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*"+" ");
            }
            sp --;
            st +=2;
            System.out.println();
        }
    }
}