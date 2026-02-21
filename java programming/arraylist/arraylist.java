package arraylist;
import java.util.ArrayList;
class arraylist{
    public static void main (String[] args) {
        //creating ArrayList object
        ArrayList<Integer> l1=new ArrayList<>();
        //adding elements into ArrayList
        l1.add(5);
        l1.add(4);
        //printing ArrayList required index elements
        System.out.println(l1.get(1));
        //printing ArrayList all elements 
        System.out.print(l1);
        //adding extra elements to the required postion int the ArrayList
        l1.add(1,10);
        System.out.print(l1);
        //modifying the ArrayList elements 
        l1.set(1,6);
        System.out.print(l1);
        //removing an elements from ArrayList using index postion
        l1.remove(1);
        System.out.print(l1);
        //removing an elements from ArrayList using value
        l1.remove(Integer.valueOf(4));
        System.out.print(l1);
        // checking the elements present int the ArrayList
        boolean ans=l1.contains(Integer.valueOf(50));
        System.out.print(ans);
        //
        ArrayList l2=new ArrayList<>();
        l2.add("ganesh");
        l2.add(5);
        l2.add(true);
        System.out.print(l2);
        
    }
}