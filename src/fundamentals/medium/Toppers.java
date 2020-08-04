package fundamentals.medium;

import java.util.Scanner;

/**
 * <h1><a href="https://mycode.prepbytes.com/problems/fundamentals/TOPPER">
 * Toppers</a></h1>
 */
public class Toppers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        while (tests-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int n = scanner.nextInt();
            printCheatedNumbers(a, b, c, n);
            // printCheatedNumbersRecursively(a, b, c, n);
            System.out.println();
        }
    }

    private static void printCheatedNumbers(int a, int b, int c, int n) {
        System.out.print(a + " " + b + " " + c + " ");
        for (int i = 3; i < n; i++) {
            int d = a + b + c;
            System.out.print(d + " ");
            a = b;
            b = c;
            c = d;
        }
    }

    private static void printCheatedNumbersRecursively(int a, int b, int c,
                                                       int n) {
        if (n == 0) {
            return;
        }
        System.out.print(a + " ");
        printCheatedNumbersRecursively(b, c, a + b + c, --n);
    }
}
