package MileStone2.Recursion2;

// Remove X
// Send Feedback
// Given a string, compute recursively a new string where all 'x' chars have been removed.
// Input format :
// String S
// Output format :
// Modified String
// Constraints :
// 1 <= |S| <= 10^3
// where |S| represents the length of string S. 
// Sample Input 1 :
// xaxb
// Sample Output 1:
// ab
// Sample Input 2 :
// abc
// Sample Output 2:
// abc
// Sample Input 3 :
// xx
// Sample Output 3:
class RemoveX {
    public static String modifiedStr = "";

    public static String check(String input, int n) {
        if (n == 0) {
            return modifiedStr;
        }
        if (input.charAt(n - 1) != 'x') {
            modifiedStr = input.charAt(n - 1) + modifiedStr;
        }
        check(input, n - 1);

        return modifiedStr;
    }

    // Return the changed string
    public static String removeX(String input) {
        // Write your code here
        int n = input.length();
        return check(input, n);

    }
}