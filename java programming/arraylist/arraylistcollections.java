package arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class arraylistcollections 

{
    static void rev(ArrayList<Integer>l1){
            int i=0,j=l1.size()-1;
            while(i<j){
                Integer temp=Integer.valueOf(l1.get(i));
                l1.set(i,l1.get(j));
                l1.set(j,temp);
                i++;
                j--;
            }
        }
    public static void main (String[] args) {
        
        //creating ArrayList object
        ArrayList<Integer> l1=new ArrayList<>();
        //adding elements into ArrayList
        l1.add(9);
        l1.add(4);
        l1.add(6);
        l1.add(1);
        l1.add(7);
        
        System.out.print(l1);
        // Collections.reverse(l1);
        rev(l1);
        System.out.print(l1);
        //sorting an ArrayList in ascending order
        Collections.sort(l1);
        System.out.print(l1);
        //sorting an ArrayList in decending order
        Collections.sort(l1,Collections.reverseOrder());
        System.out.print(l1);
        // ArrayList of String Type
        ArrayList<String> l2=new ArrayList<>();
        l2.add("rao");
        l2.add("ganesh");
        l2.add("kumar");
        System.out.print(l2);
       //sorting an ArrayList String in ascending order
        Collections.sort(l2);
        System.out.print(l2);
        //sorting an ArrayList String in descending order
        Collections.sort(l2,Collections.reverseOrder());
        System.out.print(l2);
        
        
    }
}