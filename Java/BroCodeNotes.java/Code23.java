// July 24, 2025

import java.util.Scanner;

public class Code23 {
    /* This is about for loops.
        For loops execute some code a CERTAIN amount of times */

    public static void main(String[] args) throws InterruptedException  {
        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i > 0; i-=3) {
            System.out.println(i); // Loops for a certain amount
        }

        // Here is a code you can have user input on
        System.out.println("Enter the amount of times you want to loop: ");
        int max = scanner.nextInt();

        for (int i = 1; i <= max; i++) {
            System.out.println(i);
        }

        // Countdown project
        System.out.println("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000); // Not necessary. This is more intermediate.
        }

        System.out.println("Happy new year");
    
    scanner.close();

    }
}