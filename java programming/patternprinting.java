import java.util.*;
public class patternprinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt();
        for(int i =1;i<=r;i++){
            for(int j=1;j<=c;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

