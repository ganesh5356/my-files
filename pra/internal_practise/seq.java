package internal_practise;
import java.util.*;
public class seq {
    static int seqserch(int []arr,int t){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size :");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the target value :");
        int t=sc.nextInt();
        System.out.println( seqserch(arr, t));
       

    }
}
