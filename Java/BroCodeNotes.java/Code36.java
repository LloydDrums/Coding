// July 27, 2025

import java.util.Scanner;

public class Code36 {
    public static void main(String[] args) {

        // Project: quiz game

        // QUESTIONS
        String[] questions = {
            "What year did Christopher Columbus 'discover' America?",
            "What is 11 * 17?",
            "What is the name of the animator with a red hat? who made a video about Crocs?",
            "What is the country above Belgium?",
            "How many wives did Henry VIII have?", // think "Horrible Histories"
        };

        // OPTIONS (array) [][]
        String[][] options = {
            {"1. 1492", "2. 1498", "3. 1500", "4. 1501"},
            {"1. 210", "2. 198", "3. 200", "4. 187"},
            {"1. JaidenAnimations", "2. TheOdds1Out", "3. Jawbreaker Juice", "4. Daily Dose of Internet"},
            {"1. France", "2. Germany", "3. Netherlands", "4. Luxembourg"},
            {"1. Seven", "2. Six", "3. Eight", "4. Nine"},
        };

        // DECLARE VARIABLES
        int [] answers = {1, 4, 3, 3, 2}; // correct
        int score = 0;
        int guess = 0;

        Scanner scanner = new Scanner(System.in);

        // WELCOME MESSAGE
        System.out.println("Here is a quiz game for you to try");

        // QUESTION (loop)
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]){ // OPTIONS (loop))
                System.out.println(option);
            }

            System.out.print("Enter your guess: "); // Guess from user
            guess = scanner.nextInt();

            if (guess == answers[i]) { // Check guess
                System.out.println("Nice job!");
                score++;
            }
            else {
                System.out.println("that is wrong");
            }
        }

        // FINAL SCORE
        System.out.println("Your score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}