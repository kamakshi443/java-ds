package MileStone1.Lecture5;

import java.util.Scanner;

// Sum Pattern
// Send Feedback
// Write a program to print triangle of user defined integers sum.
// Input Format :
// A single integer, N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// 1=1
// 1+2=3
// 1+2+3=6
// Sample Input 2 :
//  5
// Sample Output 2 :
// 1=1
// 1+2=3
// 1+2+3=6
// 1+2+3+4=10
// 1+2+3+4+5=15
public class SumPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int i = 1;

            while (i <= n) {
                int j = 1, sum = 0;
                while (j <= i) {
                    sum += j;
                    if (j == i) {
                        System.out.print(j);

                    } else {
                        System.out.print(j + "+");
                    }
                    j++;
                }
                System.out.print("=" + sum);

                System.out.println();
                i++;
            }
        }
    }
}
