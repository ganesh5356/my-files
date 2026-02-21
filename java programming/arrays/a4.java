package arrays;
import java.util.Arrays;
import java.util.Scanner;
// Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method 
// for calculating the minimum element
public class a4 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the "+n+" elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min_array=Arrays.stream(arr)
                            .min()
                            .getAsInt();
        System.out.println("the minimum elemnent in an array:"+min_array);



    }
}

