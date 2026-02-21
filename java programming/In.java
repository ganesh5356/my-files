interface A{
void show();
void get();
}
class B implements A{
public void show()
{
    System.out.println("car showed...");
}
public void get()
{
    System.out.println("car got...");
}
}
public class In {
   public static void main(String[] args) {
    A obj = new B();
    obj.get();
    obj.show();
   } 
}
