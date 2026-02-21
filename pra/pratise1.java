import java.util.*;

class pratise {
    static int[] prefixsum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size :");
        int n = sc.nextInt();
        int[] arr = new int[n ];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.print("enter the 1st no :");
        // int l=sc.nextInt();
        // System.out.print("enter the 2nd no :");
        // int r=sc.nextInt();
        prefixsum(arr);
        printarr(arr);

    }
}
