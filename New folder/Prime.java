import java.lang.*;
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 1) {
            System.out.println(a + "is a prime number");
        } else {
            System.out.println(a + "is not a prime number");
        }
    }
}
