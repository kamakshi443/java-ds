package MileStone2.Recursion1;

// Sum Of Array
// Send Feedback
// Given an array of length N, you need to find and return the sum of all elements of the array.
// Do this recursively.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Output Format :
// Sum
// Constraints :
// 1 <= N <= 10^3
// Sample Input 1 :
// 3
// 9 8 9
// Sample Output 1 :
// 26
// Sample Input 2 :
// 3
// 4 2 1
// Sample Output 2 :
// 7    
public class SumOfArrays {
    public static int sum1 = 0;

    public static int sum(int input[]) {

        if (input.length == 0) {
            return 0;
        }

        int[] smallArr = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallArr[i - 1] = input[i];
        }
        return sum1 + input[0] + sum(smallArr);
    }
}
