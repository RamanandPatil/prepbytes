package fundamentals.easy;

import java.util.Scanner;

/**
 * <h1><a href="https://mycode.prepbytes.com/problems/fundamentals/LEAP">
 * Leap Year or Not</a></h1>
 * We all have made fun of our friends who have their birthdays on
 * 29<sup>th</sup> February. Given birthday year N of your friend, can you tell
 * her if that is leap year or not? <br /><br />
 * <h3>Input format</h3>
 * The first line contains an integer T denoting the number of test cases.<br
 * />
 * Each test case contains one integer N. <br /><br />
 * <h3>Output format</h3>
 * For each test case on a new line, print Yes if the given year is a leap year
 * else print No.<br /><br />
 * <h3>Constraints</h3>
 * 1 <= T <= 10
 * <br />
 * 1 <= N <= 2500
 * <br /><br />
 * <h3>Time Limit</h3>
 * 1 second
 * <br /><br />
 * <h3>Example</h3>
 * <h4>Input</h4>
 * 2
 * <br />
 * 1900
 * <br />
 * 2012
 * <br /><br />
 * <h4>Output</h4>
 * No
 * <br />
 * Yes
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        for (int i = 0; i < tests; i++) {
            int year = scanner.nextInt();
            if (isLeapYear(year)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    /**
     * 
     * @param year
     * @return
     */
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
}
