package fundamentals.easy;

import java.util.Scanner;

/**
 * <h1><a href="https://mycode.prepbytes.com/problems/fundamentals/PATTERN3">
 * V Pattern</a></h1>
 */
public class VPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        printVPattern(letter);
    }

    private static void printVPattern(String letter) {
        int rows = 5;
        int columns = 10;
        int letterCount = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < columns; j++) {
                if (j <= letterCount) {
                    System.out.print(j);
                } else if (j >= columns - letterCount) {
                    System.out.print(columns - j);
                } else {
                    System.out.print(" ");
                }
            }
            letterCount++;
            System.out.println();
        }
    }
}
