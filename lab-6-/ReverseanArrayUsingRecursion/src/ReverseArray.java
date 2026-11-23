public class ReverseArray {

    public static void reverseArray(int[] arr, int left, int right) {

        // Step 1: Write the base case.
        // If left >= right, there is nothing left to swap.
        if (left >= right) {
            return;
        }

        // Step 2: Store the value at the left index in a temporary variable.
        int temp = arr[left];

        // Step 3: Move the value at the right index to the left index.
        arr[left] = arr[right];

        // Step 4: Put the temporary value at the right index.
        arr[right] = temp;

        // Step 5: Make a recursive call.

        // Move left one position forward.

        // Move right one position backward.
        reverseArray(arr, left + 1, right - 1);
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        //create numbers array with 10,20,30,40,50 
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original array:");
        displayArray(numbers);

        //call reverseArray with the right parameters
        reverseArray(numbers, 0, numbers.length - 1);

        System.out.println("Reversed array:");
        displayArray(numbers);
    }
}


/*
=====================================================================
COMPLEXITY ANALYSIS
=====================================================================

Measurement         Complexity      Explanation
---------------------------------------------------------------------
Time complexity     O(n)            Each recursive call swaps two elements and moves both left and right pointers inward by 1, resulting in n/2 recursive calls with O(1) work per call.
=====================================================================
*/
