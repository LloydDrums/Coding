// July 26, 2025

import java.util.Scanner;

public class Code32 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
        
        // This is a code allowing us to enter user input into an array.

        String[] foods;
        int size; 

        System.out.print("What # of food do you want?: ");
        size = scanner.nextInt(); // Get the number of food items from user input
        scanner.nextLine();

        foods = new String[size];


        scanner.nextLine(); // Consume the newline character left by nextInt()
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food item: " + (i + 1) + ": ");
            foods[i] = scanner.nextLine(); // Store user input in the array
        }

        for (String food : foods) { // Enhanced for loop to iterate over each food in the array.
            System.out.println(food); // Prints each food to the console.
        }

        System.out.println(foods.length); // Prints the number of elements in the array, which is 3.

        scanner.close();
    }
}