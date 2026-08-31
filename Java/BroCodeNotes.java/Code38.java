// July 27, 2025

import java.util.Random;
import java.util.Scanner;

// Slot machine game
/* Please don't do any real-life gambling */

public class Code38 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Delcare variables
        int balance = 100; // Starting balance
        int bet = 10; // Default bet
        int payout;
        String[] row;
        String playAgain;

        // Welcome message
        System.out.println("**********************************");
        System.out.println("    Welcome to the Slot Machine Game!");
        System.out.println("Symbols: 🍒, 🍋, 🍊, 🍉, 🍇");
        System.out.println("**********************************");

        while (balance > 0) { // Play if balance > 0
            System.out.println("Your current balance: $" + balance);
            System.out.print("Enter your bet amount: "); // Enter bet amount
            bet = scanner.nextInt();
            scanner.nextLine(); // Newline character

            if (bet > balance) { // Verify if bet > balance
                System.out.println("Invalid funds. You only have $" + balance);
                continue; // Ask for bet again
            } else if (bet <= 0) { // Verify if bet > 0
                System.out.println("Bet must be greater than 0.");
                continue; // Ask for bet again
            } else {
                balance -= bet; // Subtract bet from balance
            }

            System.out.println("Spinning...");// Spin row
            row = spinRow(); // Get row of symbols
            printRow(row); // Print row of symbols
            payout = getPayout(row, bet); // Get payout

            if (payout > 0) {
                System.out.println("You won: $" + payout);
                balance += payout; // Add payout to balance
            } else {
                System.out.println("Sorry, you lost this round.");
            }

            if (balance <= 0) {
                System.out.println("You've run out of money! Game over.");
                break;
            }

            System.out.print("Would you like to play again? (Y/N): "); // ASK to play again
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
                break; // Exit the loop if user doesn't want to play again
            }
        }

        System.out.println("Your final balance: $" + balance); // Final balance

        scanner.close();
    }

    static String[] spinRow() {
        String[] symbols = {"🍒", "🍋", "🍊", "🍉", "🍇"};
        String[] row = new String[3];
        // Using Random object from main for consistency, though Math.random() works too
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    static void printRow(String[] row) {
        System.out.println("***********************************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("***********************************");
    }

    static int getPayout(String[] row, int bet) {

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 10; // 3 Cherries
                case "🍋" -> bet * 15; // 3 Lemons
                case "🍊" -> bet * 20; // 3 Oranges
                case "🍉" -> bet * 25; // 3 Watermelons
                case "🍇" -> bet * 50; // 3 Grapes
                default -> 0; // No payout
            };
        }

        else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2; // 2 Cherries
                case "🍋" -> bet * 3; // 2 Lemons
                case "🍊" -> bet * 4; // 2 Oranges
                case "🍉" -> bet * 5; // 2 Watermelons
                case "🍇" -> bet * 10; // 2 Grapes
                default -> 0; // No payout
            };
        }

        else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 3; // 2 Cherries
                case "🍋" -> bet * 4; // 2 Lemons
                case "🍊" -> bet * 5; // 2 Oranges
                case "🍉" -> bet * 10; // 2 Watermelons
                case "🍇" -> bet * 20; // 2 Grapes
                default -> 0;
            };
        }
        return 0; // No payout
    }
}