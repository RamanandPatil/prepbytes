package fundamentals.easy;

import java.util.Scanner;

/**
 * <h1><a href="https://mycode.prepbytes.com/problems/fundamentals/PATTERN3">
 * V Pattern</a></h1>
 */
public class VPattern {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // String letter = scanner.next();
        printVPattern("V");
        System.out.println();
        printVPattern();
    }

    private static void printVPattern(String letter) {
        if (!letter.equalsIgnoreCase("v")) {
            return;
        }
        int rows = 5;
        int columns = 10;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else if (j >= columns - i + 1) {
                    System.out.print(columns - j + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printVPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 5; j >= 1; j--) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
