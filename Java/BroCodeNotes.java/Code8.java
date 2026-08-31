// July 21, 2025

// Here is how to generate a random class and numbers

import java.util.Random; // That is the class for random.

public class Code8 {
    public static void main(String[] args) {
        
        Random random = new Random();

        int number;
        int number2;
        int number3;

        number = random.nextInt(1, 100); // Parentheses inside set boundaries. Generates a number between 1 and 99.
        number2 = random.nextInt(1, 101); // Between 1 and 100
        number3 = random.nextInt(1, 101); // Between 1 and 100
        
        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);

        double number4;
        number4 = random.nextDouble();
        System.out.println(number4);

        boolean isTails;
        isTails = random.nextBoolean();
        System.out.println(isTails);

        // An easier way to do a boolean random generator is to use an if statement
        if (isTails) {
            System.out.println("Tails");
        } 
        else {
            System.out.print("Heads");
            
        }

    }

}