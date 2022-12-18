package MileStone1.Test2;
// Number Star Pattern

// Send Feedback
// Print the following pattern for given number of rows.
// Input format :

import java.util.Scanner;

// Line 1 : N (Total number of rows)

// Sample Input :
//    5
// Sample Output :
// 1234554321
// 1234**4321
// 123****321
// 12******21
// 1********1
public class NumberStarPattern {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i = 1;
            while (i <= n) {
                int j = 1;

                while (j <= n - i + 1) {
                    System.out.print(j);
                    j++;
                }

                int k = 1;
                while (k < i) {
                    System.out.print("*");
                    k++;
                }
                int rk = 1;
                while (rk < i) {
                    System.out.print("*");
                    rk++;
                }

                int dn = n - i + 1;
                while (dn > 0) {
                    System.out.print(dn);
                    dn--;
                }

                i++;
                System.out.println();
            }
        }

    }
}
