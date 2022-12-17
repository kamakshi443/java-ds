package MileStone1.Lecture4;

import java.util.Scanner;

// Code : Triangle Number Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 1
// 22
// 333
// 4444
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
// 1
// 22
// 333
// 4444
// 55555
// Sample Input 2:
// 6
// Sample Output 2:
// 1
// 22
// 333
// 4444
// 55555
// 666666
public class TriangleNumberPattern {
    public static void main(String[] args) {
        int n, i = 1;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
