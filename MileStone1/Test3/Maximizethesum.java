package MileStone1.Test3;

// Maximise the sum
// Send Feedback
// Given 2 sorted arrays (in increasing order), find a path through the intersections that produces maximum sum and return the maximum sum.
// That is, we can switch from one array to another array only at common elements.
// If no intersection element is present, we need to take sum of all elements from the array with greater sum.
// Input Format :
//  Line 1 : An integer M i.e. size of first array
//  Line 2 : M integers which are elements of first array, separated by spaces
//  Line 3 : An integer N i.e. size of second array
//  Line 4 : N integers which are elements of second array, separated by spaces
// Output Format :
// Maximum sum value
// Constraints :
// 1 <= M, N <= 10^6
// Sample Input :
// 6
// 1 5 10 15 20 25
// 5
// 2 4 5 9 15
// Sample Output :
// 81
// Explanation :
// We start from array 2 and take sum till 5 (sum = 11). Then we'll switch to array at element 10 and take till 15. So sum = 36. Now, no elements left in array after 15, so we'll continue in array 1. Hence sum is 81
public class Maximizethesum {
    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }

    public static long maximumSumPath(int[] ar1, int[] ar2) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, they are passed as function arguments.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        // initialize indexes for ar1[] and ar2[]
        int i = 0, j = 0;
        int m = ar1.length;
        int n = ar2.length;

        // Initialize result and current sum through ar1[]
        // and ar2[].
        int result = 0, sum1 = 0, sum2 = 0;

        // Below 3 loops are similar to merge in merge sort
        while (i < m && j < n) {
            // Add elements of ar1[] to sum1
            if (ar1[i] < ar2[j])
                sum1 += ar1[i++];

            // Add elements of ar2[] to sum2
            else if (ar1[i] > ar2[j])
                sum2 += ar2[j++];

            // we reached a common point
            else {
                // Take the maximum of two sums and add to
                // result
                // Also add the common element of array,
                // once
                result += max(sum1, sum2) + ar1[i];

                // Update sum1 and sum2 for elements after
                // this intersection point
                sum1 = 0;
                sum2 = 0;

                // update i and j to move to next element of
                // each array
                i++;
                j++;
            }
        }

        // Add remaining elements of ar1[]
        while (i < m)
            sum1 += ar1[i++];

        // Add remaining elements of ar2[]
        while (j < n)
            sum2 += ar2[j++];

        // Add maximum of two sums of remaining elements
        result += max(sum1, sum2);

        return result;
    }
}
