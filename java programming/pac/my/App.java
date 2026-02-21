package pac.my;

public class App{
    public String name="this is a public member";
    public static void main(String[] args) {
        App obj=new App();
        System.out.println("with in the class :"+obj.name);
        Out obj2=new Out();
        obj2.outside();
    }
}

class Out{
    void outside(){
        App obj2=new App();
        System.out.println("out side class with in the package :"+obj2.name);
    }
}
