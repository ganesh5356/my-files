public class demo5 {

        public static void rearrange(int[] arr) {
            int n = arr.length;
    
            // Step 1: Separate positive and negative numbers
            int[] positive = new int[n];
            int[] negative = new int[n];
            int posIndex = 0, negIndex = 0;
    
            // Traverse the array and segregate the positive and negative numbers
            for (int i = 0; i < n; i++) {
                if (arr[i] >= 0) {
                    positive[posIndex++] = arr[i];
                } else {
                    negative[negIndex++] = arr[i];
                }
            }
    
            // Step 2: Start filling the original array in alternating fashion
            int i = 0; // Index for the original array
            int posPointer = 0, negPointer = 0;
    
            // Alternate placement of negative and positive elements
            while (negPointer < negIndex && posPointer < posIndex) {
                arr[i++] = negative[negPointer++];
                arr[i++] = positive[posPointer++];
            }
    
            // Step 3: Place remaining elements
            // If there are remaining negative numbers, place them at the end
            while (negPointer < negIndex) {
                arr[i++] = negative[negPointer++];
            }
    
            // If there are remaining positive numbers, place them at the end
            while (posPointer < posIndex) {
                arr[i++] = positive[posPointer++];
            }
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, -4, -1, 4};
            rearrange(arr);
    
            // Print the rearranged array
            for (int num : arr) {
                System.out.print(num + " ");
            }
            // Output should alternate, starting with a negative number, e.g., -5 6 -2 7 -1 4 -3
        }
    }
    

