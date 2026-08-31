// July 24, 2025

import java.util.Scanner;

public class Code21 {
    /* This is about while loops.
    While loops repeat code forever while condition is true
    They are normally declared with a boolean variable/expression */

    // Infinte loops cause errors

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String response = "";

       while (! response.equals("Q")) {
           System.out.print("You are playing a game");
           System.out.print("Press Q to quit: ");
           response = scanner.next().toUpperCase();
       }

       System.out.print("You have quit the game");

       // Example 1 here:
       int age = 0;
        
        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        while (age < 0) {
           System.out.println("Your age can't be negative");
           System.out.print("Enter your age: ");
           age = scanner.nextInt();
       }

        System.out.println("You are " + age + "years old");

        // Example 2 here with a do-while loop:
       int number = 0;

        do {
           System.out.println("Enter a number between 1 - 10: ");
           number = scanner.nextInt();
       } while (number < 1 || number > 10);

        System.out.println("You picked " + number);

    scanner.close();

    }
}