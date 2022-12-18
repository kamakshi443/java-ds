package MileStone1.Test1;

import java.util.Scanner;

// Check AP
// Send Feedback
// Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.
// Input format :
// Line 1 : n
// Line 2 : n numbers
// Sample Input 1 :
// 6
// 2 6 10 14 18 22
// Sample Output 1 :
// true
// Sample Input 2 :
// 6
// 2 6 10 15 19 23
// Sample Output 2 :
// false
public class CheckAP {
    static boolean checkIsAP(double arr[], int n) {
        if (n == 1)
            return true;
        double d = arr[1] - arr[0];
        for (int i = 2; i < n; i++) {
            if (arr[i] - arr[i - 1] != d) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            double[] arr = new double[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print(checkIsAP(arr, n));
        }

    }
}
