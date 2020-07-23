package fundamentals.easy;

import java.util.Scanner;

/**
 * <h1><a href="https://mycode.prepbytes.com/problems/fundamentals/BOXTOY">
 * Boxes and Toys</a></h1>
 */
public class BoxesAndToys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBoxes = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= numberOfBoxes; i++) { // i is the box number
            int numberOfToys = scanner.nextInt();
            int capacity = scanner.nextInt();
            if (capacity - numberOfToys >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
