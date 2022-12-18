package MileStone1.Lecture12String;
// Reverse Each Word

// Send Feedback
// Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
// Example:
// Input Sentence: "Hello, I am Aadil!"
// The expected output will print, ",olleH I ma !lidaA".
// Input Format:
// The first and only line of input contains a string without any leading and trailing spaces. The input string represents the sentence given to Aadil.
// Output Format:
// The only line of output prints the sentence(string) such that each word in the sentence is reversed. 
// Constraints:
// 0 <= N <= 10^6
// Where N is the length of the input string.

// Time Limit: 1 second
// Sample Input 1:
// Welcome to Coding Ninjas
// Sample Output 1:
// emocleW ot gnidoC sajniN
// Sample Input 2:
// Always indent your code
// Sample Output 2:
// syawlA tnedni ruoy edoc
public class ReverseEachWord {

    public static String reverseEachWord(String str) {
        // Your code goes here
        String result = "";
        int n = str.length();
        int startWord = 0;
        int endWord = n;
        int j;
        String revWord = "";

        for (int i = 0; i < n; i++) {
            revWord = "";
            if (str.charAt(i) == ' ') {
                endWord = i - 1;
                for (j = endWord; j >= startWord; j--) {
                    revWord = revWord + str.charAt(j);
                }
                startWord = i + 1;
                result = result + revWord + " ";
            }
        }
        revWord = "";
        for (j = n - 1; j >= startWord; j--) {
            revWord = revWord + str.charAt(j);
        }
        result = result + revWord + " ";
        return result;
    }
}
