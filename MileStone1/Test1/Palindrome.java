package MileStone1.Test1;

import java.util.Scanner;

// Palindrome number
// Send Feedback
// Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
// Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121
// Sample Input 1 :
// 121
// Sample Output 1 :
// true
// Sample Input 2 :
// 1032
// Sample Output 2 :
// false
public class Palindrome {

    public static void main(String[] args) {
        // Write your code here

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int rev = 0, digit;
            int val = n;
            while (n > 0) {
                digit = n % 10;
                rev = rev * 10 + digit;
                n /= 10;
            }

            if (val == rev) {
                System.out.println("true");
            } else {
                System.out.println("false");

            }
        }
    }
}
