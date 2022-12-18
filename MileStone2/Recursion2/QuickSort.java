package MileStone2.Recursion2;
// Quick Sort - Problem Statement

// Send Feedback
// Sort an array A using Quick Sort.
// Change in the input array itself. So no need to return or print anything.

// Input format :
// Line 1 : Integer n i.e. Array size
// Line 2 : Array elements (separated by space)
// Output format :
// Array elements in increasing order (separated by space)
// Constraints :
// 1 <= n <= 10^3
// Sample Input 1 :
// 6 
// 2 6 8 5 4 3
// Sample Output 1 :
// 2 3 4 5 6 8
// Sample Input 2 :
// 5
// 1 5 2 7 3
// Sample Output 2 :
// 1 2 3 5 7 
public class QuickSort {
    public static void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j < high; j++) {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static void quickSort(int[] input, int startIndex, int endInedx) {
        // your code goes here
        if (startIndex >= endInedx) {
            return;
        }

        int i = partition(input, startIndex, endInedx);
        quickSort(input, startIndex, i - 1);
        quickSort(input, i + 1, endInedx);
    }

    public static void quickSort(int[] input) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * No need to print or return the output.
         * Taking input and printing output is handled automatically.
         */
        quickSort(input, 0, input.length - 1);

    }
}
