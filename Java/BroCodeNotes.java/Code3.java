// July 18, 2025
// This is a code about accepting user input

import java.util.Scanner;

public class Code3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is, " + name );

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your favorite color is: " + age + " years old.");
        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("What is your favorite color? ");
        String color = scanner.nextLine();
        System.out.println("Your favorite color is: " + color);
    

        System.out.print("Do you enjoy coding in Java? (true/false): ");
        
        boolean codingJava = scanner.nextBoolean();

        if (codingJava) {
            System.out.println("Nice to know you enjoy coding in Java!");
            } else {
            System.out.println("I see you don't enjoy coding in Java. That's okay, everyone has their preferences.");
        }
        
        scanner.close();

        // For example: here is how to calculate area of a rectangle
        double width = 0;
        double height = 0;
        double area = 0;
        scanner = new Scanner(System.in); // Reinitialize scanner for new input

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("The area of the rectangle is: " + area + "cm².");
        
        scanner.close();
        
    }    
}