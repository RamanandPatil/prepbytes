package fundamentals.easy;

import java.util.Scanner;

/**
 * <h1><a href="https://mycode.prepbytes.com/problems/fundamentals/HOUSEHUNTA">
 * Part A: House Hunting</a></h1>
 */
public class HouseHuntingA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // We already have below:
        float portion_down_payment = 0.25f;
        float current_savings = 0;
        float R = 0.04f; // annual return on investment
        float additional = 0; // current_savings * R / 12;


        // Get the required inputs from user:
        float annual_salary = scanner.nextFloat();
        float total_cost = scanner.nextFloat();
        float portion_saved = scanner.nextFloat();

        // Calculate some required amounts
        float monthly_salary = annual_salary / 12;
        float target_down_payment = total_cost * portion_down_payment;

        int monthCount = 0;

        while (current_savings < target_down_payment) {
            additional = current_savings * R / 12;
            current_savings += ((monthly_salary * portion_saved) + additional);
            monthCount++;
        }
        System.out.println(monthCount);
    }
}
