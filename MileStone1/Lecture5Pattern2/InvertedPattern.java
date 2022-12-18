package MileStone1.Lecture5Pattern2;

import java.util.Scanner;

// Code : Inverted Number Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 4444
// 333
// 22
// 1
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints :
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
// 55555 
// 4444
// 333
// 22
// 1
// Sample Input 2:
// 6
// Sample Output 2:
// 666666
// 55555 
// 4444
// 333
// 22
// 1
public class InvertedPattern {
    public static void main(String[] args) {
        int n, i = 1;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        while (i <= n) {
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print(n - i + 1);
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
