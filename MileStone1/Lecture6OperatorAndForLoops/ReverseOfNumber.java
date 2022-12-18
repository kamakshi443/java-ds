package MileStone1.Lecture6OperatorAndForLoops;
// Reverse of a number

// Send Feedback
// Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
// Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.

import java.util.Scanner;

// Input format :
// Integer N
// Output format :
// Corresponding reverse number
// Constraints:
// 0 <= N < 10^8
// Sample Input 1 :
// 1234
// Sample Output 1 :
// 4321
// Sample Input 2 :
// 1980
// Sample Output 2 :
// 891
public class ReverseOfNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int rev = 0, digit;
            while (num > 0) {
                digit = num % 10;
                rev = rev * 10 + digit;
                num /= 10;
            }
            System.out.println(rev);
        }
    }
}
