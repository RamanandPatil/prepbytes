package fundamentals.easy;

import java.util.Scanner;

/**
 * <h1><a https://mycode.prepbytes.com/problems/fundamentals/SHOPCST">
 * Shopping Cost</a></h1>
 */
public class ShoppingCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int items = scanner.nextInt();
        for (int i = 0; i < items; i++) {
            int quantity = scanner.nextInt();
            double price = scanner.nextDouble();
            System.out.println(String.format("%.1f",getFinalCost(quantity, price)));
        }
    }

    /**
     *
     * @param quantity
     * @param price
     * @return
     */
    private static double getFinalCost(int quantity, double price) {
        double finalCost = quantity * price;
        if (quantity > 100) {
            finalCost -= (finalCost * 20 / 100);
        }
        return finalCost;
    }
}
