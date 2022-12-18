package MileStone1.Lecture7FunctionsAndScope;
// Fibonacci Number

import java.util.Scanner;

// Send Feedback
// Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
// Fibonacci Series is defined by the recurrence
//     F(n) = F(n-1) + F(n-2)
// where F(0) = 0 and F(1) = 1

// Input Format :
// Integer N
// Output Format :
// true or false
// Constraints :
// 0 <= n <= 10^4

public class FiboNum {
    public static boolean isPerfectSquare(int n) {
        int a = (int) Math.sqrt(n);
        return n == a * a;
    }

    public static boolean checkMember(int n) {
        return isPerfectSquare(5 * n * n - 4) || isPerfectSquare(5 * n * n + 4);
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            System.out.println(checkMember(n));
        }
    }
}
