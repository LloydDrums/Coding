// July 26, 2025

import java.util.Scanner;

public class Code29 {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Here is a simple banking program based off of local/class variables and methods.

        // 1: Declare variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

while (isRunning) {
    // 2: Menu display
    System.out.println("Banking Program");
    System.out.println("1: Show Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Exit");
        System.out.println("***************");

        // 3: Get and process user's choice
        System.out.print("Enter your choice (1-4): ");
        choice = scanner.nextInt();

        switch(choice) {
            case 1 -> showBalance(balance);
            case 2 -> balance += deposit();
            case 3 -> balance -= withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("Invalid choice");
            }
        }

        System.out.println("Thank you for using this banking program!");
        // 4: showBalance()

        // 5: deposit()

        // 6: withdraw()


       scanner.close();
    }

    // Show balance method
    static void showBalance(double balance) {
        System.out.println("***************");
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    // Deposit method
    static double deposit () {
        double amount;

        System.out.print("Enter an amount to be deposited: ");

        amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Deposit amount must be positive.");
            return 0; // Return 0 if the deposit amount is invalid
        }
        else {
            return amount;
        }
    }

    // Withdraw method
    static double withdraw(double balance) {
        double amount;

        System.out.print("Enter an amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds");
            return 0;
        } 
        else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }
    }
}