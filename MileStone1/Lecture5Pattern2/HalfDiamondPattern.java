package MileStone1.Lecture5Pattern2;
// Half Diamond Pattern

// Send Feedback
// Write a program to print N number of rows for Half Diamond pattern using stars and numbers
// Note : There are no spaces between the characters in a single line.

import java.util.Scanner;

// Input Format :
// A single integer: N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// *
// *1*
// *121*
// *12321*
// *121*
// *1*
// *
// Sample Input 2 :
//  5
// Sample Output 2 :
// *
// *1*
// *121*
// *12321*
// *1234321*
// *123454321*
// *1234321*
// *12321*
// *121*
// *1*
// *
public class HalfDiamondPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int i = 1;
            System.out.print("*");
            System.out.println();

            while (i <= n) {
                int j = 1;
                System.out.print("*");
                while (j <= i) {
                    System.out.print(j);
                    j++;
                }
                int rev = i - 1;
                while (rev > 0) {
                    System.out.print(rev);
                    rev--;
                }

                System.out.print("*");
                System.out.println();
                i++;
            }

            int k = n - 1;

            while (k > 0) {
                int j = 1;
                System.out.print("*");
                while (j < k + 1) {
                    System.out.print(j);
                    j++;
                }
                int rev = k - 1;
                while (rev > 0) {
                    System.out.print(rev);
                    rev--;
                }
                System.out.print("*");
                System.out.println();
                k--;
            }
        }
        System.out.print("*");
    }
}
