package fundamentals.easy;

import java.util.Scanner;

/**
 * <h1><a href="https://mycode.prepbytes.com/problems/fundamentals/HOUSEHUNTB">
 * Part B: House Hunting</a></h1>
 */
public class HouseHuntingB {
    public static void main(String[] args) {
        // We already have below:
        float portion_down_payment = 0.25f;
        float current_savings = 0;
        float R = 0.04f; // annual return on investment
        float additional = 0; // current_savings * R / 12;


        // Get the required inputs from user:
        Scanner scanner = new Scanner(System.in);
        float annual_salary = scanner.nextFloat();
        float total_cost = scanner.nextFloat();
        float portion_saved = scanner.nextFloat();
        float semi_annual_raise = scanner.nextFloat();

        // Calculate some required amounts
        float monthly_salary = annual_salary / 12;
        float target_down_payment = total_cost * portion_down_payment;

        int monthCount = 0;

        while (current_savings < target_down_payment) {
            additional = current_savings * R / 12;
            current_savings += ((monthly_salary * portion_saved) + additional);
            monthCount++;
            if (monthCount % 6 == 0) {
                annual_salary += (annual_salary * semi_annual_raise);
                monthly_salary = annual_salary / 12;
            }
        }
        System.out.println(monthCount);
    }
}
