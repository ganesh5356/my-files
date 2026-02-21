package internal_practise;
 public class mergesort {

    public static void mergeSort(int[] array) {
        if (array.length < 2) return;

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Split the array into left and right
        for (int i = 0; i < mid; i++) left[i] = array[i];
        for (int i = mid; i < array.length; i++) right[i - mid] = array[i];

        // Sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge them together
        merge(array, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compare elements and merge
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) array[k++] = left[i++];
            else array[k++] = right[j++];
        }

        // Add leftovers
        while (i < left.length) array[k++] = left[i++];
        while (j < right.length) array[k++] = right[j++];
    }
    static void printarr(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 6, 3, 8, 5, 2, 7, 4, 1 };
        mergeSort(numbers);
        printarr(numbers);
        // for (int num : numbers) System.out.print(num + " ");
    }

    
}
