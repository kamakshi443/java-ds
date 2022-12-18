package MileStone1.Test1;

import java.util.Scanner;

// Number Star pattern 1
// Send Feedback
// Print the following pattern for given number of rows.
// Input format :
// Integer N (Total number of rows)
// Output Format :
// Pattern in N lines
// Sample Input :
//    5
// Sample Output :
//  5432*
//  543*1
//  54*21
//  5*321
//  *4321
public class NumberOfStarPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i = 1;
            int l = n;
            while (i <= n) {
                int j = 0;
                int k = n;
                while (j < n - i) {
                    System.out.print(k);
                    j++;
                    k--;
                }

                while (l == n - i + 1) {
                    System.out.print("*");
                    l--;
                }
                int f = i - 1;
                while (f > 0) {
                    System.out.print(f);
                    f--;
                }
                i++;

                System.out.println();
            }
        }

    }
}
