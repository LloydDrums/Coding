// July 23, 2025

import java.util.Scanner;
// This is a project code of a compound interest calculator.

// A = P [ 1 + r/n]^nt  --> Compound interest formula
    /* A = amount of money */
    /* P = principal amount (what you start with) */
    /* r = interest rate */
    /* n = number of times money was compounded; time compounded (yearly, quarterly = 4, monthly = 12) */
    /* t = time */
public class Code11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timeCompund;
        int years;
        double amount;

        System.out.println("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.println("Enter the interest rate (in %): ");
        rate = scanner.nextDouble()/ 100;

        System.out.println("Enter the # of times compounded per year: ");
        timeCompund = scanner.nextInt();

        System.out.println("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timeCompund, timeCompund * years);

        System.out.printf("The amount after " + years + "is: $" + amount);
        System.out.printf("The amount after %d years is .2%f", years, amount); // Same formula just in a printf statement.
    
    scanner.close();  
    }
}
    