package fundamentals.easy;

import java.util.Scanner;

/**
 * <h1><a href="https://mycode.prepbytes.com/problems/fundamentals/MAXDRAWS">
 * PrepBuddy and Socks</a></h1>
 */
public class PrepBuddyAndSocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        for (int i = 0; i < tests; i++) {
            int socksPairs = scanner.nextInt();
            System.out.println(maxDraws(socksPairs));
        }
    }

    /**
     * In the worst case, on a really bad day, he will take out socks of all
     * different colors. Untill at last there is no unique color left! So
     * total unique colors = number of pair. So the next sock after taking
     * out single sock from all the pair is going to be repeated.
     * <p>
     * Therefore, we can say that in worst case he will draw (p + 1) sock
     * where p is the number of pairs.
     * It doesn't matter which pair completes. The only condition is pair MUST
     * complete.
     *
     * @param socksPairs number of socks pairs
     * @return
     */
    public static int maxDraws(int socksPairs) {
        return socksPairs + 1;
    }
}
