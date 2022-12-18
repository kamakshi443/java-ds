package MileStone1.Lecture5Pattern2;
// Code : Triangle of Numbers

// Send Feedback
// Print the following pattern for the given number of rows.
// Pattern for N = 4

import java.util.Scanner;

// The dots represent spaces.

// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints :
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
//           1
//          232
//         34543
//        4567654
//       567898765
public class TraingleNumberPattern {
    public static void main(String[] args) {
        int n, i = 1;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }
            int j = 1;
            while (j <= i) {
                System.out.print(i + j - 1);
                j++;
            }
            int k = 1;
            while (k < i) {
                System.out.print(2 * i - 1 - k);
                k++;
            }
            i++;
            System.out.println();
        }
    }
}
