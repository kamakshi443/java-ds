package MileStone1.Lecture4;

import java.util.Scanner;

// Code : Interesting Alphabets
// Send Feedback
// Print the following pattern for the given number of rows.
// Pattern for N = 5
// E
// DE
// CDE
// BCDE
// ABCDE
// Input format :
// N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 26
// Sample Input 1:
// 8
// Sample Output 1:
// H
// GH
// FGH
// EFGH
// DEFGH
// CDEFGH
// BCDEFGH
// ABCDEFGH
// Sample Input 2:
// 7
// Sample Output 2:
// G
// FG
// EFG
// DEFG
// CDEFG
// BCDEFG
// ABCDEFG
public class InterestingAlphabets {
    public static void main(String[] args) {
        int n, i = 1;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        while (i <= n) {
            int k = (char) ('A' + n - i);
            int j = 1;
            while (j <= i) {
                System.out.print((char) k);
                j++;
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
