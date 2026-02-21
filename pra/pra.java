

public class pra {
    static int gcd(int a,int b){
        if(b==0)
        return a;
        else
        return gcd(b,a%b);
    }
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sel(int []arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])
                min=j;
            }
            swap(arr,i,min);
        }
    }
    static void printarr(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int  fact(int n){
        if (n==0)
        return 1;
        else
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner (System.in);
        // System.out.println("enter the 1st number :");
        // int a=sc.nextInt();
        // System.out.println("enter the 1st number :");
        // int b=sc.nextInt();
        // System.out.println("the gcd of "+ a + " and "+ b + " is: "+gcd(a,b)) ;
        // int []arr={64,25,12,22,11};
        // System.out.print("unsorted array is :");
        // printarr(arr);
        // System.out.println();
        // System.out.print("sorted array is :");
        // sel(arr);
        // printarr(arr);
        // System.out.println();
        System.out.println(fact(5));
        
    }
}
