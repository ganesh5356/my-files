package imp;

import java.util.Scanner;

public class arr {
    static void swap(int []ar,int i,int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
    static void rev(int []ar){
        int i=0,j=ar.length-1;
        while(i<j){
            swap(ar, i, j);
            i++;
            j--;
        }
    }
    static  void printar(int []ar){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []ar=new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        rev(ar);
        printar(ar);
    }
}
