

public class S extends Thread{
    public void run()
    {
        for (int i=0;i<4;i++)
        {
            try{
                Thread.sleep(100);
                System.out.println("thread is running "+i);
            }
            catch(InterruptedException e)
            {
                System.out.println("thread interuppted");
            }
        }
        System.out.println("thread exceution completed");

    }
    public static void main(String[] args) {
        S obj=new S();
        obj.start();
    }
}
