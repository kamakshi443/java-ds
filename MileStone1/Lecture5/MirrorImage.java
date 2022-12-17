package MileStone1.Lecture5;
// Code : Mirror Image Number Pattern

// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 4

import java.util.Scanner;

// The dots represent spaces.

// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 50
// Sample Input 1:
// 3
// Sample Output 1:
//       1 
//     12
//   123
// Sample Input 2:
// 4
// Sample Output 2:
//       1 
//     12
//   123
// 1234
public class MirrorImage {
    public static void main(String[] args) {
        int n, i = 1;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
