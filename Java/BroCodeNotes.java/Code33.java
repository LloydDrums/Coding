// July 27, 2025

import java.util.Scanner;

public class Code33 {
        public static void main(String[] args) {
        
        // This is a code that shows you how to search an array.

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 3, 27, 54, 81, 243};
        int target = 7; // want to find in the array
        boolean isFound = false; // check if target is found

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("Found at index " + i);
                isFound = true; // set isFound to true if target is found
                break; // Exit the loop once the target is found
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array");
        }

        // Array of strings, searching for an element (user input)
        String [] fruits = {"apple", "banana", "orange"};
        String targetFruit = "orange"; // want to find in the array
        boolean fruitFound = false; // check if target is found

        for (int i = 0; i < fruits.length; i++) {
            if (targetFruit.equals(fruits[i])) { // Use equals() for string comparison
                System.out.println("Found " + targetFruit + " at index " + i);
                isFound = true; // set isFound to true if target is found
                break; // Exit the loop once the target is found
            }
        }

        // User input
        String [] books = {"The Magic Tree House", "Diary of a Wimpy Kid", "I Survived"};
        String targetBook = scanner.nextLine();
        boolean bookFound = false; // check if target is found

        System.out.println("Enter the book you want to search for: ");
        targetBook = scanner.nextLine(); // Get user input for the book to search

        for (int i = 0; i < books.length; i++) {
            if (targetBook.equals(books[i])) { // Use equals() for string comparison
                System.out.println("Found at index " + i);
                bookFound = true; // set bookFound to true if target is found
                break; // Exit the loop once the target is found
            }
        }
        scanner.close();
    }
}