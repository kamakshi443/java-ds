package MileStone1.Lecture4;

import java.util.Scanner;

// Code : Alpha Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 3
//  A
//  BB
//  CCC
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 26
// Sample Input 1:
// 7
// Sample Output 1:
// A
// BB
// CCC
// DDDD
// EEEEE
// FFFFFF
// GGGGGGG
// Sample Input 2:
// 6
// Sample Output 2:
// A
// BB
// CCC
// DDDD
// EEEEE
// FFFFFF

public class AlphaPattern {
    public static void main(String[] args) {
        int n, i = 1;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print((char) ('A' + i - 1));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
