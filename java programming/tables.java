
import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number of which table you want :");
        int n = sc.nextInt();
        int tab = n;
        int sum = 0;
        for (int i = n; i <= n * 10; i += n) {
            sum = sum + 1;
            System.out.println(tab + "*" + sum + "=" + i);
        }
    }

}
