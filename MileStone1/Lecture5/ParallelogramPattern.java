package MileStone1.Lecture5;
// Parallelogram Pattern

// Send Feedback
// Write a program to print parallelogram pattern for the given N number of rows.
// For N = 4

import java.util.Scanner;

// The dots represent spaces.
// Input Format :
//  A single integer : N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// ***
//  ***
//   ***
// Sample Input 2 :
// 5
// Sample Output 2 :
// *****
//  *****
//   *****
//    *****
// *****
public class ParallelogramPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i = 1;
            while (i <= n) {
                int space = 1;
                while (space < i) {
                    System.out.print(" ");
                    space++;
                }

                int star = 1;
                while (star <= n) {
                    System.out.print("*");
                    star++;
                }
                System.out.println();
                i++;
            }
        }
    }
}
