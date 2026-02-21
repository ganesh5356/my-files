import java.lang.*;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter divedend");
        int D = sc.nextInt();
        System.out.println("enter divisior");
        int d = sc.nextInt();
        int q = D / d;
        int r = D - (d * q);
        System.out.println(r);

    }

}
