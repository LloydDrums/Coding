// July 27, 2025

import java.util.Random;
import java.util.Scanner;

public class Code37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 🪨📄✂️ game

        // DECLARE VARIABLES
        String[] choices = {"rock", "paper", "scissors"};
        String userChoice;
        String botChoice;
        String playAgain = "yes";

        do {
            // GET USER CHOICE
            System.out.print("Enter your move [Rock, Paper, Scissors]: ");
            userChoice = scanner.nextLine().toLowerCase();

        if (! userChoice.equals("rock") && 
        !userChoice.equals("paper") && 
        !userChoice.equals("scissors")) {
            System.out.println("Invalid choice");
            continue; 
        }

        // GET RANDOM CHOICE
        botChoice = choices[random.nextInt(3)];
        System.out.println("Bot chose: " + botChoice);

        // CHECK WINNER
        if (userChoice.equals(botChoice)) {
            System.out.println("It's a tie!");  
        }

        else if ((userChoice.equals("rock") && botChoice.equals("scissors")||
                   userChoice.equals("paper") && botChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && botChoice.equals("paper"))) {
            System.out.println("You win!");
        }

        else {
            System.out.println("You lose!");
        }

        // ASK TO PLAY AGAIN
        System.out.print("Play again? (yes/no): ");
        playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        // GOODBYE MESSAGE
        System.out.println("Thanks for playing!");

        scanner.close();
    }
}