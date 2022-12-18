package MileStone1.Test3;

// Minimum Length Word
// Send Feedback
// Given a string S (that can contain multiple words), you need to find the word which has minimum length.
// Note : If multiple words are of same length, then answer will be first minimum length word in the string.
// Words are seperated by single space only.
// Input Format :
// String S
// Output Format :
// Minimum length word
// Constraints :
// 1 <= Length of String S <= 10^5
// Sample Input 1 :
// this is test string
// Sample Output 1 :
// is
// Sample Input 2 :
// abc de ghihjk a uvw h j
// Sample Output 2 :
// a
public class MinimumLengthWord {
    public static String minLengthWord(String input) {

        // Write your code here
        int n = input.length();
        int si = 0;
        int ei = 0;
        int minStartIndex = 0;
        int minLength = n;
        String minword = "";
        while (ei <= n) {

            if (ei < n && input.charAt(ei) != ' ') {
                ei++;
            } else {
                int currlen = ei - si;
                if (currlen < minLength) {
                    minStartIndex = si;
                    minLength = currlen;
                }
                ei++;
                si = ei;
            }
        }
        minword = input.substring(minStartIndex, minStartIndex + minLength);
        return minword;

    }
}
