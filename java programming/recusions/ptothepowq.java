package recusions;

import java.util.Scanner;

public class ptothepowq {
    static int pow(int p ,int q){ //time complexity is O(q)
        if(q==0)
        return 1;
        else return pow(p,q-1)*p;
    }
    static int pow_minusone(int p ,int q){ // p^q-1 same time complexity O(p)
        if(q==1)
        return 1;
        else return pow_minusone(p,q-1)*p;
    }
    static int pw(int p,int q){ // less time complexity as compared to above O(log q)
        if(q==0)
        return 1;
        int smpo=pw(p,q/2);
        if(q%2==0)
            return smpo*smpo;
        return p*smpo*smpo;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.println(pw(p,q));
    }
}
