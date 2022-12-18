package MileStone1.Lecture5Pattern2;
// Code : Diamond of stars

// Send Feedback
// Print the following pattern for the given number of rows.
// Note: N is always odd.

import java.util.Scanner;

// Pattern for N = 5

// The dots represent spaces.

// Input format :
// N (Total no. of rows and can only be odd)
// Output format :
// Pattern in N lines
// Constraints :
// 1 <= N <= 49
// Sample Input 1:
// 5
// Sample Output 1:
//   *
//  ***
// *****
//  ***
//   *
// Sample Input 2:
// 3
// Sample Output 2:
//   *
//  ***
//   *
public class DiamondStarPattern {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        int i = 1;
        while (i <= n / 2 + 1) {
            int space = 1;
            while (space <= n / 2 - i + 1) {
                System.out.print(" ");
                space++;
            }
            int star = 1;
            while (star <= 2 * i - 1) {
                System.out.print("*");
                star++;
            }
            i++;
            System.out.println();
        }
        int k = 1;
        while (k <= n / 2) {
            int space = 1;
            while (space <= k) {
                System.out.print(" ");
                space++;
            }
            int star = 1;
            while (star <= 2 * (n / 2 - k) + 1) {
                System.out.print("*");
                star++;
            }

            k++;
            System.out.println();
        }
    }
}
