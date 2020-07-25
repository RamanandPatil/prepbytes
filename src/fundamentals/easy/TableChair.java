package fundamentals.easy;

import java.util.Scanner;

/**
 * <h1><a href="https://mycode.prepbytes.com/problems/fundamentals/TABLECHAIR">
 * Table Chair</a></h1>
 */
public class TableChair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        while (tests-- > 0) {
            long currentTC = scanner.nextInt(); // TC = TableChairs
            long typeR1 = scanner.nextInt();
            long typeR2 = scanner.nextInt();
            long typeR3 = scanner.nextInt();
            System.out.println(
                    getMinimumAmount(currentTC, typeR1, typeR2, typeR3));
        }
    }

    private static long getMinimumAmount(long currentTC,
                                         long one,
                                         long two,
                                         long three) {
        // Check if current TC are sufficient for all 4 banks
        long rem = currentTC % 4;
        if (rem == 0) {
            return 0;
        }
        if (rem == 1) { // We need to add 3 sets
            return min(one + one + one, one + two, three);
        }
        if (rem == 2) { // We need to add 2 sets or 6 sets
            return min(one + one, two, three + three);
        }
        if (rem == 3) { // We need to add 1 sets or 5 sets or 9 sets
            return min(one, two + three, three + three + three);
        }
        return 0;
    }

    public static long min(long n1, long n2) {
        return Math.min(n1, n2);
    }

    public static long min(long n1, long n2, long n3) {
        return min(min(n1, n2), n3);
    }
}
