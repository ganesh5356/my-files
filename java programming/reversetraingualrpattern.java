import java.util.Scanner;

public class reversetraingualrpattern {
 
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        for(int i =1;i<=r;i++){ //another method is i=1;i<=r;i++
            for(int j=i;j<=r;j++) // another method is j=1;j=1+r-i;j++
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
