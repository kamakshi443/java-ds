package MileStone1.Lecture6OperatorAndForLoops;

import java.util.Scanner;

// Binary to decimal
// Send Feedback
// Given a binary number as an integer N, convert it into decimal and print.
// Input format :
// An integer N in the Binary Format
// Output format :
// Corresponding Decimal number (as integer)
// Constraints :
// 0 <= N <= 10^9
// Sample Input 1 :
// 1100
// Sample Output 1 :
// 12
// Sample Input 2 :
// 111
// Sample Output 2 :
// 7
public class BinaryToDecimal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int binary = sc.nextInt();
            int decimal = 0, power = 0, digit;
            while (binary > 0) {
                digit = binary % 10;
                decimal += Math.pow(2, power) * digit;
                binary /= 10;
                power++;
            }
            System.out.println(decimal);
        }

    }
}
