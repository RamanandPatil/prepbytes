package fundamentals.easy;

import java.util.Scanner;

/**
 * <h1><a href="https://mycode.prepbytes.com/problems/fundamentals/RVSREUM">
 * Reverse the number</a></h1>
 */
public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(reverseNumber(number));

        // few other tests:
        System.out.println(reverseNumber(0)); // 0
        System.out.println(reverseNumber(-5));
        System.out.println(reverseNumber(5));
        System.out.println(reverseNumber(-10));
        System.out.println(reverseNumber(10));
        System.out.println(reverseNumber(-15));
        System.out.println(reverseNumber(15));
        System.out.println(reverseNumber(-100));
        System.out.println(reverseNumber(100));
        System.out.println(reverseNumber(123));
        System.out.println(reverseNumber(12345));
    }

    /**
     * Reverses the given number and returns the reversed number
     *
     * @param number the number to be reversed
     * @return the reversed number
     */
    public static int reverseNumber(int number) {
        if (number > -10 && number < 10) {
            return number;
        }
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber += number % 10;
            number /= 10;
            if (number != 0) {
                reversedNumber *= 10;
            }
        }
        return reversedNumber;
    }
}
