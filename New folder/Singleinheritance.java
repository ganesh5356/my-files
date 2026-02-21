import java.lang.*;

class A {

    int a = 10;

}

class B extends A {
    void ad() {
        int b = 20;
        System.out.println(a + b);
    }
}

public class Singleinheritance {

    public static void main(String[] args) {
        B ob = new B();
        ob.ad();
    }
}
