package fundamentals.easy;

import java.util.Scanner;

/**
 * <h1><a href="https://mycode.prepbytes.com/problems/fundamentals/DRAYE">
 * Dragon Visit</a></h1>
 */
public class DragonVisit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        while (tests-- > 0) {
            int year = scanner.nextInt();
            if (dragonVisited(year)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static boolean dragonVisited(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }


}
