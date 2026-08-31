// July 24, 2025

import java.util.Scanner;

public class Code19 {
    /* 
    This is a project code on making a calculator program 
    based off of enhanced switches
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch(operator) {
            case '+' -> result = num1 + num2; // Adding
            case '-' -> result = num1 - num2; // Subtract
            case '*' -> result = num1 * num2; // Multiply
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot divide by zero"); // If result is zero
                    validOperation = false;
                }
                else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator"); // If operator does not exist
                validOperation = false;
            }
        }

        if (validOperation);
            System.out.println(result);

        scanner.close();
    }
}