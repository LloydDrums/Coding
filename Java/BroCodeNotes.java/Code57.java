// July 31, 2025

import java.util.InputMismatchException;
import java.util.Scanner;

public class Code57 {
    public static void main(String[] args) {
    // Exception = interrupts program flow
        /* They pop up if you:
            Divide by zero
            Lose your file (lost resource location)
            Mismatch input type */
    // You can handle exceptions with: try{}, catch{}, finally{},
    /* Any dangerous code, surround with a try{} block */

    Scanner scanner = new Scanner(System.in);

    // Example
    System.out.println(27/0); // A dangerous code that causes exception

    try {
        System.out.println(27/0); // Arithmetic Exception
    }
    catch (ArithmeticException e) { // Catch the exception
        System.out.println("You CAN'T divide by zero");
    } // It's like an if-else statement/for-while loop


    // Example with user input

    try (Scanner scanner2 = new Scanner(System.in)) {
        System.out.print("Enter a number:"); 
        int number = scanner2.nextInt();
        System.out.println(number);
    }
    catch(InputMismatchException e){
        System.out.println("That is not a number!");
    }
    catch (ArithmeticException e) { // Catch the exception
        System.out.println("You CAN'T divide by zero");
    }
    catch(Exception e){ // Safety net at the end
        System.out.println("Something went wrong");
    }
    finally{ // Cleaning up program. Optional
        scanner.close();
        System.out.println("This always executes");
    }
    }
}