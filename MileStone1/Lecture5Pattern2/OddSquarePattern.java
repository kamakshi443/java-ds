package MileStone1.Lecture5Pattern2;

import java.util.Scanner;

// Odd Square
// Send Feedback
// Write a program to print the pattern for the given N number of rows.
// For N = 4
// 1357
// 3571
// 5713
// 7135
// Input Format :
// A single integer: N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// 135
// 351
// 513
// Sample Input 2 :
//  5
// Sample Output 2 :
// 13579
// 35791
// 57913
// 79135
// 91357
public class OddSquarePattern {
    public static void main(String[] args) {
        int n, i = 1;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }

        while (i <= n) {
            int dec = n - i + 1;
            int k = i * 2 - 1;
            int j = 0;
            while (dec > 0) {
                System.out.print(k + j);
                j += 2;
                dec--;
            }

            int j1 = 1;
            int k1 = 1;

            while (j1 < i) {
                System.out.print(k1);
                j1++;
                k1 += 2;
            }
            System.out.println();
            i++;
        }
    }
}
