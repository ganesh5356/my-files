public class digitcount {
    public static void main(String[] args) {
        int n=1234;
        int dg=0;
        while(n>0){
            n=n/10;
            dg++;   
        }
       System.out.println(dg);
    }
}
