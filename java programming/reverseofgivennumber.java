import java.util.*;
public class reverseofgivennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int re=0;
        while(n>0){
            re=re*10+n%10;
            n=n/10;
        }
        System.out.println(re);
    }
}
