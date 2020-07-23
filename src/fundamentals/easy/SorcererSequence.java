package fundamentals.easy;

import java.util.Scanner;

/**
 * <h1><a href="https://mycode.prepbytes.com/problems/fundamentals/JUGGLER">
 * Sorcerer Sequence</a></h1>
 */
public class SorcererSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        for (int i = 0; i < tests; i++) {
            int number = scanner.nextInt();
            printSorcererSequence(number);
        }
    }

    private static void printSorcererSequence(int number) {
        StringBuilder sb = new StringBuilder();
        while (number > 1) {
            System.out.print(number + " ");
            if (number % 2 == 0) {
                number = (int) Math.floor(Math.sqrt(number));
            } else {
                number = (int) Math.floor(Math.sqrt(number)
                                          * Math.sqrt(number)
                                          * Math.sqrt(number));
            }
        }
        System.out.println(number);
    }

    private static void printSorcererSequenceRecursive(int number) {
        System.out.print(number + " ");
        if (number <= 1) {
            return;
        }
        if (number % 2 == 0) {
            number = (int) Math.pow(number, 1.0 / 2.0);
        } else {
            number = (int) Math.pow(number, 3.0 / 2.0);
        }
        printSorcererSequenceRecursive(number);
    }
}
