import java.lang.*;
import java.util.*;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int val = 1;
        for (int i = 1; i <= a; i++) {
            val = val * i;
            // System.out.println(i);
        }
        System.out.println(val);

    }
}
