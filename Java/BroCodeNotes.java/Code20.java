// July 24, 2025

import java.util.Scanner;

public class Code20 {
    /* This is about logical operators.
    Logiical operators allow us to check/modify conditions */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // && = AND (all conditions must be true)
        // ! = NOT (checks if something is not true)
        // || = OR (only one condition must be true)

        double temp = 35;
        boolean isSunny = true;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is good today");
            System.out.println("It is sunny outside");
        }
        else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is good today");
            System.out.println("It is cloudy outside");
        }
        else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad today");
        }

        // Here, you can try it with your user input. Here are the rules: 
        /* 
            Username should between 4-12 characters
            Username should NOT have spaces or underscores
        */

       String username;

       System.out.print("Enter your new username: ");
       username = scanner.nextLine();

       if (username.length() < 4 || username.length() > 12) {
           System.out.println("Username should between 4-12 characters");
       } else if (username.contains(" ") || username.contains("_")){
        System.out.println("Username should NOT have spaces or underscores");
       }
       else {
        System.out.println("Hello there " + username);
    }
    scanner.close();
    }
}