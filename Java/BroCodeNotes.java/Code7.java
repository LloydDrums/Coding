// July 21, 2025

import java.util.Scanner;

public class Code7 {
// Statements
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);

            String name;
            int age;
            boolean Quiet;

            System.out.print("Enter your name:");
            name = scanner.nextLine();

            System.out.println("Enter your age: ");
            age = scanner.nextInt();

            System.out.println("Are you a quiet person (true/false) ");
            Quiet = scanner.nextBoolean();

            // GROUP 1
            if (name.isEmpty()) {
                System.out.println("You didn't enter your name!"); // If condition is true
            }
            else {
                System.out.println("Hello " + name + "!");
            }

            // GROUP 2
            if (age >= 18) {
                System.out.println("You are an adult!"); // If condition is true
            }
            else if (age >= 65) {
                System.out.println("You are a senior!"); // an Otherwise condition
            }
            else if (age < 0) {
                System.out.println("You have not been born yet!"); //
            }
            else if (age >= 18) {
                System.out.println("You are an baby!");
            }
            else {
                System.out.println("You are a child"); // If condition is false
            }
            
            // GROUP 3
        if (Quiet) {
            System.out.println("You are a quiet person, me too.");
        } else {
            System.out.println("You are probably the opposite. Maybe, I don't know");
        }

        scanner.close();
    }
}