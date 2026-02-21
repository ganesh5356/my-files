package imp;
import java.util.*;
public class prefixsumusingrange {
    static int [] preffsum(int []arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size :");
        int n=sc.nextInt();
        int [] arr=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        int []pref=preffsum(arr);
        
        System.out.print("enter queries");
        int q=sc.nextInt();
        
        while (q-- > 0){
            System.out.print("enter the range :");
            
            int l=sc.nextInt();
            int r=sc.nextInt();
            
            int ans=pref[r]-pref[l-1];
            
            System.out.println("sum "+ ans);
        }
}
}
