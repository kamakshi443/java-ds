package MileStone1.Lecture12String;

// Reverse String Wordwise
// Send Feedback
// Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
// Input format :
// String in a single line
// Output format :
// Word wise reversed string in a single line
// Constraints :
// 0 <= |S| <= 10^7
// where |S| represents the length of string, S.
// Sample Input 1:
// Welcome to Coding Ninjas
// Sample Output 1:
// Ninjas Coding to Welcome
// Sample Input 2:
// Always indent your code
// Sample Output 2:
// code your indent Always
public class ReverseStringWordwise {
    public static String reverseWordWise(String str) {
        // Write your code here

        int n = str.length();
        String res = "";
        int start = 0;
        int end = n - 1;
        int j;
        String word = "";

        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                word = "";
                start = i + 1;
                for (j = start; j <= end; j++) {
                    word += str.charAt(j);
                }
                end = i - 1;
                res = res + word + " ";
            }
        }
        word = "";

        for (j = 0; j <= end; j++) {
            word = word + str.charAt(j);
        }
        res += word;

        return res;
    }
}
