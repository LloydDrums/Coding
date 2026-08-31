// July 26, 2025

import java.util.Arrays;

public class Code31 {
        public static void main(String[] args) {
        
        // Arrays = element collection of the same type

        String[] fruits = {"apple", "banana", "orange", "coconut"};

        fruits[0] = "pineapple"; // change the first element to "pineapple"

        System.out.println(fruits[0]); // Prints "pineapple" to the console.

        // Array length = number of elements in the array
        int numFruit = fruits.length; // Gets the number of elements in the array
        System.out.println(numFruit); // Prints "Number of 4 fruits" to the console.

        // How to print all array elements
        // Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple"); // Fills the array with "pineapple"

        for (String fruit : fruits) { // Enhanced for loop to iterate over each fruit in the array.
            System.out.print(fruit + " "); // Prints each fruit to the console.
        }
    }
}