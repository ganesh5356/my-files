import pac.my.App;
public class outsidepac {
    public static void main(String[] args) {
        App obj =new App();
        // System.out.println("outside package non child class :"+obj.name);
        ou bj2=new ou();
        bj2.chi();

    }
}
class ou extends outsidepac{
    void chi(){
    App obj2=new App();
    // System.out.println("out side pacakge child class :"+obj2.name);
    }
}