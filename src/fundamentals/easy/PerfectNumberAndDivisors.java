package fundamentals.easy;

import java.util.Scanner;

/**
 * <h1><a href="https://mycode.prepbytes.com/problems/fundamentals/PRFCTNO">
 * Perfect Number and Divisors</a></h1>
 */
public class PerfectNumberAndDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        for (int i = 0; i < tests; i++) {
            int number = scanner.nextInt();
            System.out.println(isPerfectNumber(number));
        }
    }

    /**
     * @param number
     * @return
     */
    public static boolean isPerfectNumber(int number) {
        if (number < 2) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) { // need to go half of the number
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
