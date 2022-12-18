package MileStone2.AssignmentRecursion;
// Check Palindrome (recursive)

// Send Feedback
// Check whether a given String S is a palindrome using recursion. Return true or false.
// Input Format :
// String S
// Output Format :
// 'true' or 'false'
// Constraints :
// 0 <= |S| <= 1000
// where |S| represents length of string S.
// Sample Input 1 :
// racecar
// Sample Output 1:
// true
// Sample Input 2 :
// ninja
// Sample Output 2:
// false

public class CheckPalindromeRec {

    public static boolean check(int s, int e, String input) {
        if (input.length() / 2 == s) {
            return true;
        }
        if (input.charAt(s) != input.charAt(e)) {
            return false;
        }
        return check(s + 1, e - 1, input);
    }

    public static boolean isStringPalindrome(String input) {
        // Write your code here
        int n = input.length();
        int s = 0;
        int e = n - 1;

        return check(s, e, input);

    }
}
