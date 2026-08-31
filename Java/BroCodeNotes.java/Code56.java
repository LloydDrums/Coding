// July 30, 2025

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Code56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // Array list (resizeable array that stores objects)
    /* Arrays -> fixed in size;  ArrayLists can change*/

    // Storing integers
    ArrayList<Integer> list = new ArrayList<>();

    list.add(3); //add (built in to add)
    list.add(2);
    list.add(1);
    System.out.println(list); // Prints "[3, 2, 1]" to the console.

    // Storing double
    ArrayList<Double> doubleList = new ArrayList<>();

    doubleList.add(3.14);
    doubleList.add(2.79);
    doubleList.add(1.12);
    System.out.println(doubleList); // Prints "[3.14, 2.79, 1.12]" to console.

    // Storing strings
    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Banana"); // My favorite song from them is "Camera One" from "Whoo Hoo! Wiggly Gremlins!"
    fruits.add("Grape");
    fruits.add("Apple");
    fruits.add("Melon"); // All those fruits = reference to The Wiggles song "Fruit Salad, Yummy Yummy"
    System.out.println(fruits); // Prints "[Banana, Grape, Apple, Melon]" to the console.

    // Removing an element at an index changes entirely.
    ArrayList<String> fruits2 = new ArrayList<>();
    fruits2.add("Pineapple"); 
    fruits2.add("Kiwi");
    fruits2.add("Blackberry");
    fruits2.add("Cucumber");

    fruits2.remove(1);
    System.out.println(fruits2); // Prints "[Pineapple, Blackberry, Cucumber]" to the console.

    // Set method replaces elements
    ArrayList<String> fruits3 = new ArrayList<>();
    fruits3.add("Banana"); 
    fruits3.add("Grape");
    fruits3.add("Apple");
    fruits3.add("Melon");

    fruits3.set(2, "Bluberry"); // Replace index 2 with "Bluberry"
    System.out.println(fruits3); // Prints "[Banana, Grape, Bluberry, Melon]" to the console.

    // Get method to get an element
    ArrayList<String> fruits4 = new ArrayList<>();
    fruits4.add("Banana"); 
    fruits4.add("Grape");
    fruits4.add("Apple");
    fruits4.add("Melon");

    System.out.println(fruits4.get(2)); // Prints "Apple" to the console.
    System.out.println(fruits4.size()); // Shows how many elements in your array. Prints "4" to the console.

    // ArrayList sorting
    Collections.sort(fruits4); // Call sort method, then pass array list
    System.out.println(fruits4); // Prints "[Apple, Banana, Grape, Melon]" to the console.

    // Enhanced FOR LOOP to iterate fruit elements
    for (String fruit : fruits4) {
        System.out.print(fruit);
    }

    // User input of an arrayLIST

    ArrayList<String> foods = new ArrayList<>();

    System.out.print("Enter the # of food you would like:");
    int numFood = scanner.nextInt();
    scanner.nextLine();

    for (int i = 1; i <= numFood; i++) {
        System.out.print("Enter food #" + i + ": ");
        String food = scanner.nextLine();
        foods.add(food);
    }

    System.out.println(foods);

    scanner.close();
    }
}