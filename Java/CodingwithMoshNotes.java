
// This file contains notes and code examples for Java programming concepts by Youtuber Coding with Mosh. This is his Java cheat sheet.

import java.awt.Point; // Imports the Date class from java.util package. Line 44
import java.text.NumberFormat; // Imports the Point class from java.awt package. Line 52
import java.util.Arrays; // Imports the Arrays class from java.util package. Line 102
import java.util.Date; // Imports the Number Format class. Line 275

public class CodingwithMoshNotes {
    public static void main(String[] args) {
        
        System.out.println("Hello World"); // Greeting message to the console
        // System = class; out = field member of standard output stream;
        // print = method to print text; println = method to print 
        // "Hello World" = text string literal to be printed

// Part 1: fundamentals (variables, primitive types, casting, numbers/strings/arrays, reading input) = mortgage calculator

    // Variables (store data like numbers in computer memory)

        int age; // integer variable, declared but not initialized here
        age = 92; // assigning the value of age to a number
        System.out.println(age); // Prints the value of age to the console

    // Primitive types (sores simple values/characters)
        byte temperature = 65; // byte variable
        System.out.println("Temperature: " + temperature); // Prints the value of temperature to the console. New message is "Temperature: 65"

        long viewCount = 3_123_456_789L; // long variable, L suffix indicates it's a long literal
        System.out.println("View Count: " + viewCount); // Prints the value of viewCount to the console. New message is "View Count: 3123456789"

        float price = 10.99F; // float variable, F suffix indicates it's a float literal
        System.out.println("Price: " + price); // Prints the value of price to the console. New message is "Price: 10.99"

        char letter = 'A'; // char variable, single quotes for character literals
        System.out.println("Letter: " + letter); // Prints the value of letter to the console. New message is "Letter: A"

        boolean isEligible = true; // boolean variables that can be true or false
        System.out.println("Is Eligible: " + isEligible); // Prints the value of isEligible to the console. New message is "Is Eligible: true"

    // Reference types (store data objects, mail messages)
        byte score = 85; // byte variable for score
        System.out.println("Score: " + score); // Prints the value of score to the console
        
        Date now = new Date(); // Creating a new Date object as a blueprint for date and time
        System.out.println(now); // Prints the current date and time
    
        byte x = 1;
        byte y = 2;
        x = 2; // Reassigning x to a new value
        System.out.println(y); // Prints the new value of y

        Point point1 = new Point(1, 1); // Creating a new Point object with coordinates (1, 1)
        Point point2 = point1; // Assigning point1 to point2
        point1.x = 2; // Changing the x-coordinate of point1 to 2
        System.out.println(point2); // Prints the coordinates of point2, which reflects the change in point1

    // Strings (text data, immutable, cannot be changed)
        String message = "Hello World"; // Shorter way to be less redundant
        System.out.println(message); // Prints the message to the console

        message = "Hello World" + "!!"; // String concatenation
        boolean endsWithExclamation = message.endsWith("!!"); // Checks if the message ends with "!!"
        System.out.println("Message ends with '!!': " + endsWithExclamation); // Prints the result to the console,
        System.out.println(message); // Prints the message to the console

        boolean startsWithExclamation = message.startsWith("!!"); // Checks if the message starts with "!!"
        System.out.println("Message starts with '!!': " + startsWithExclamation); // Prints the result to the console
        System.out.println(message); // Prints the message to the console

        System.out.println(message.length()); // Prints the length of the message. Length = number of characters in the string

        System.out.println(message.indexOf("H")); // Prints the index of the substring "H" in the message. Index of H is 0
        System.out.println(message.indexOf("e")); // Prints the index of the substring "e" in the message. Index of e is 1
        System.out.println(message.indexOf("sky")); // Prints the index of the first occurrence of "sky" in the message. Index of sky is -1
        System.out.println(message.replace("!", "*")); // Replaces "!" with "*" in the message. New message is "Hello World**"
        System.out.println(message); // Prints the original message to the console. Message remains unchanged since strings are immutable
        System.out.println(message.toLowerCase()); // Converts the message to lowercase and prints it. New message is "hello world!!"
        System.out.println(message.toUpperCase()); // Converts the message to uppercase and prints it. New message is "HELLO WORLD!!"
        message = "  Hello World" + " !!  "; // Before the trimming, the message has leading whitespace
        System.out.println(message.trim()); // Trims leading and trailing whitespace from the message and prints it.
        System.out.println(message); // Prints the modified message to the console. New message is "Hello World !!"

        // Escape Sequences (special characters in strings)
            String text = "Hello \"Lloyd\""; // Correctly escaped double quotes using backslash.
            System.out.println(text); // Prints the text with escaped quotes

            // Backlash (\) is used to escape special characters in strings.
            // Directory path example: c:\Windows\.
            String text2 = "c:\\Windows\\."; // Correctly escaped backslashes using double backslashes.
            System.out.println(text2); // Prints the file path with escaped backslashes. New message is "c:\Windows\." Terminal window shows single backslashes.

            String text3 = "c:\\nWindows\\."; //Using backlash n to add a new line in the string.
            System.out.println(text3); // Prints the file path with a new line before "Windows". New message is "c:\nWindows\."

            String text4 = "c:\\tWindows\\."; // Using backlash t to create a tab space in the string.
            System.out.println(text4); // Prints the file path with a tab space before "Windows". New message is "c:\tWindows\."

        // Arrays (store list of numbers, people, messages) have a fixed length and cannot be resized.
            int[] numbers = new int[5]; // Creating an array of integers with a size of 5
        
            numbers[0] = 1; // Assigning value 1 to the first element of the array
            numbers[1] = 2; // Assigning value 2 to the second element of the array
            System.out.println(Arrays.toString(numbers)); // Prints the array as a string. Message is "[1, 2, 0, 0, 0]"

            // Easier way to initialize an array
            int[] numbers2 = {2, 3, 5, 1, 4}; // Initializing an array with unsorted values of 1 to 5. 
            System.out.println(numbers2.length); // Prints the length of the array. In this case the length is 5. Message is "5"
            System.out.println(Arrays.toString(numbers2)); // Prints the array as a string. New message is "[2, 3, 5, 1, 4]"

            Arrays.sort(numbers2); // Sorts the array in ascending order
            System.out.println(Arrays.toString(numbers2)); // Prints the sorted array as a string. New message is "[1, 2, 3, 4, 5]"

            // Multi-dimensional arrays (arrays of arrays). Yes, that is a thing. Think of it like a math table. 2D arrays = matrix; 3D arrays = data cube storage.
            int[][] numbers3 = new int[2][3]; // Creating a 2D array with 2 rows and 3 columns
            numbers3[0][0] = 1; // Access of individual elements in the 2D array
            System.out.println(Arrays.toString(numbers3[0])); // Prints the first row of the 2D array as a string. New message is "[1, 0, 0]"
            System.out.println(Arrays.deepToString(numbers3)); // Prints the entire 2D array as a string. New message is "[[1, 0, 0], [0, 0, 0]]"

            // To initialize a 3D array with values, just add another set of brackets and specify lengths for each dimension. Example:
            int[][][] numbers4 = new int[2][3][4]; // Creating a 3D array with 2x3x4 dimensions
            numbers4[1][1][1] = 2; // Access of individual elements in the 3D array
            System.out.println(Arrays.deepToString(numbers4)); // Prints the entire 3D array as a string. New message is "[[[1, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]], [[0, 0, 0, 0], [0, 2, 0, 0], [0, 0, 0, 0]]]"

            int[][] numbers5 = {{1, 2, 3}, {4, 5, 6}}; // Curly brackets adds a new array with values
            System.out.println(Arrays.deepToString(numbers5)); // Prints the entire 2D array as a string. New message is "[[1, 2, 3], [4, 5, 6]]"

        // Constants (variables that cannot be changed)
            float pi = 3.14F; // Float variable for pi
            pi = 1; // If you reassign pi to a new value, it will result in a compilation error.
            final float PI = 3.14F; // Final variable for pi. All capital letters name constants

        // Arithmetic Expressions (number calculations)
            int add = 10 + 3; // Addition
            System.out.println(add); // Prints the result of addition. New message is "13"

            int subtract = 10 - 3; // Subtraction
            System.out.println(subtract); // Prints the result of subtraction. New message is "7"

            int multiply = 10 * 3; // Multiplication
            System.out.println(multiply); // Prints the result of multiplication. New message is "30"

            double divideDecimal = (double) 10 / (double) 3; // Division with casting to double for decimal result. 
            System.out.println(divideDecimal); // Prints the result of division. New message is "3.3333333333333335".

            int modulus = 10 % 3; // Modulus (remainder of division). % is the remainder.
            System.out.println(modulus); // Prints the result of modulus. New message is "1".

            // Increment (++) and Decrement (--) Operators are used to increase or decrease the value of a variable by 1.
            int r = 1; 
            r++; // Equivalent to r = r + 1. Now r is 2

            int r2 = r--; // Pre-decrement. r2 is assigned the value of r (2), then r is decremented to 1.
            System.out.println(r2); // Prints the value of r. New message is "1".

            int r3 = r++; // Postfix increment. r3 is assigned the value of r (1), then r is incremented to 2.
            System.out.println(r3); // Prints the value of r3. New message is "1".

            int r4 = --r; // Pre-increment. r is incremented to 2, then r4 is assigned the value of r (2).
            System.out.println(r4); // Prints the value of r4. New message is "2".


            int s = 1; 
            s++; // Equivalent to s = s + 1. Now s is 2

            int s2 = s--; // Pre-decrement. s2 is assigned the value of s (2), then s is decremented to 1.
            System.out.println(s2); // Prints the value of s. New message is "1".

            int s3 = s++; // Postfix increment. s3 is assigned the value of s (1), then s is incremented to 2.
            System.out.println(s3); // Prints the value of s3. New message is "1".

            int s4 = --s; // Pre-increment. s is incremented to 2, then s4 is assigned the value of s (2).
            System.out.println(s4); // Prints the value of s4. New message is "2".

            int s5 = s++; // Postfix increment. s5 is assigned the value of s (2), then s is incremented to 3.
            System.out.println(s5); // Prints the value of s5. New message is "2".

        // Augmented Assignment Operators
            int t = 2;
            t += 4; // Equivalent to t = t + 4. This is addition, so now t is added to 4.
            System.out.println(t); // Prints the value of t after augmented assignment. New message is "6".

            t -= 2; // Equivalent to t = t - 2. This is subtraction, so now t is subtracted by 2.
            System.out.println(t); // Prints the value of t after augmented assignment. New message is "4".

            t *= 2; // Equivalent to t = t * 2. This is multiplication, so now t is multiplied by 2.
            System.out.println(t); // Prints the value of t after augmented assignment. New message is "8".

            t /= 2; // Equivalent to t = t / 2. This is division, so now t is divided by 2.
            System.out.println(t); // Prints the value of t after augmented assignment. New message is "2".

            t %= 3; // Equivalent to t = t % 3. This is modulus, so now t is the remainder of t divided by 3.
            System.out.println(t); // Prints the value of t after augmented assignment. New message is "1".

            // Order of Operations (Parentheses, Multiplication/Division, Addition/Subtraction)
            int result = 2 + 3 * 4; // 14. Multiply 3 by 4 first, then add 2. Multiplication is first, then addition.
            System.out.println(result); // Prints the result of the expression. New message is "14".

            int result2 = (2 + 3) * 4; // Parentheses change the order of operations
            System.out.println(result2); // Prints the result of the expression with parentheses. New message is "20".

    // Casting (convert one type to another)

            // Implicit Casting (automatic conversion) byte > short > int > long > float > double
            short a = 1; // Short variable
            int b = a + 2; // Implicit casting occurs here, converting short to int automatically.
            System.out.println(b); // Prints the value of b. New message is "3".

            double c = 1.1; // Double variable.
            // Compilation error will occur here: int d = c + 3;. // Cannot implicitly cast double to int.
            double d = c + 3.0; // Implicit casting occurs here, converting double to double.
            System.out.println(d); // Prints the value of d. New message is "4.1".

            // Explicit Casting (manual conversion): if y was an integer, want to see 4 on terminal, not 4.1
            // Compilation error will occur here: int d = c + 3.0; // Cannot implicitly cast double to int.
            int dInt = (int) (c + 3.0); // Explicit casting occurs here, converting double to int.
            System.out.println(dInt); // Prints the value of dInt. New message is "4".

           // String conversions to number
           String numberString = "1"; // String variable containing a number
           byte number = Byte.parseByte(numberString); // Converts the string to a byte using Byte.parseByte()
           System.out.println(number); // Prints the value of number. New message is "1".

           String numberString2 = "2"; // String variable containing a number
           short number2 = Short.parseShort(numberString2); // Converts the string to a short using Short.parseShort()
           System.out.println(number2); // Prints the value of number2. New message is "2".

           String numberString3 = "3"; // String variable containing a number
           int num = Integer.parseInt(numberString3); // Converts the string to an integer using Integer.parseInt()
           System.out.println(num); // Prints the value of num. New message is "3".

           String numberString4 = "4"; // String variable containing a number
           long number4 = Long.parseLong(numberString4); // Converts the string to a long using Long.parseLong()
           System.out.println(number4); // Prints the value of number4. New message is "4".

           String numberString5 = "5"; // String variable containing a decimal number
           float number5 = Float.parseFloat(numberString5); // Converts the string to a float using Float.parseFloat()
           System.out.println(number5); // Prints the value of number5. New message is "5".

           String numberString6 = "6.6"; // String variable as a decimal number
           double number6 = Double.parseDouble(numberString6); // Converts the string to a double using Double.parseDouble()
           System.out.println(number6); // Prints the value of number6. New message is "6.6".

        // The Math Class provides methods for mathematical operations. Useful for calculations.
            int result3 = Math.round(1.1F); // Rounds the float value to the nearest integer
            System.out.println(result3); // Prints the rounded value. New message is "1".

            int result4 = (int) Math.ceil(1.1F); // Returns the smallest integer greater than or equal to the argument
            System.out.println(result4); // Prints the rounded up value. New message is "2".

            int result5 = (int) Math.floor(1.9F); // Returns the largest integer less than or equal to the argument
            System.out.println(result5); // Prints the rounded down value. New message is "1".

            int result6 = (int) Math.max(1, 2); // Returns the maximum of two numbers
            System.out.println(result6); // Prints the maximum value. New message is "2".

            int result7 = (int) Math.min(1, 2); // Returns the minimum of two numbers
            System.out.println(result7); // Prints the minimum value. New message is "1".

            double result8 = Math.random(); // Generates a random number between 0 and 1
            System.out.println(result8); // Prints the random number. New message is a random decimal number between 0 and 1.

            double result9 = Math.random() * 100; // Generates a random number between 0 and 100
            System.out.println(result9); // Prints the random number. New message is a random decimal number between 0 and 100.

            double result10 = Math.round(Math.random() * 100); // Generates a random number between 1 and 100
            System.out.println(result10); // Prints the random number. New message is a random decimal

            int result11 = (int)Math.round(Math.random() * 100); // Generates a random integer between 1 and 100
            System.out.println(result11); // Prints the random number. New message is a random integer between 1 and 100.

            int result12 = (int)Math.round(Math.random() * 100); // Generates a random number between 1 and 100
            System.out.println(result12); // Prints the random number. New message is a random integer between 1 and 100.

        // Formatting Numbers
            NumberFormat currency = NumberFormat.getCurrencyInstance(); // Creates a currency format instance method
            String formattedCurrency = currency.format(1234567.891); // Formats the number as currency. 1234567.891 is the format number.
            System.out.println(formattedCurrency); // Prints the formatted currency. New message is "$1,234,567.89"

            NumberFormat percent = NumberFormat.getPercentInstance(); // Creates a percentage format instance
            String formattedPercent = percent.format(0.15); // Formats the number as a percentage
            System.out.println(formattedPercent); // Prints the formatted percentage. New message is "15%"

        // Reading Input. Here are various ways to read different inputs.
            // Scanner scanner = new Scanner(System.in); Creates a new Scanner object to read input from the console
            // double number = scanner.nextDouble(); Reads a double value from the console
            // byte number = scanner.nextByte(); Reads a byte value from the console
            // String name = scanner.next(); Reads a string value from the console
            // String line = scanner.nextLine(); Reads a line of text input from the user
            // scanner.close(); // Closes the scanner to free up resources
            
// Part 2: Control Flow (if/else, switch, loops, break/continue, for-each, while/do-while)

    // Operators (convert one type to another)

        // Comparison (==, !=, >, <, >=, <=) 
        //x == y; equality operator 
        //x != y; in-equality operator 
        //x > y; greater than operator
        //x >= y; greater than or equal to operator
        //x < y; less than operator
        //x <= y; less than or equal to operator

        // Logical (&&, ||, !) combine multiple boolean expressions
        // x && y; AND operator, true if both x and y are true
        // x || y; OR operator, true if either x or y is true
        // !x; NOT operator, true if x is false. Reverses the boolean value of x
    
    // If/Else Statements (conditional statements)
        int degrees = 25; // Degrees variable

        if (degrees > 30) {
            System.out.println("It's a hot day.");
        } else if (degrees < 30) {
            System.out.println("It's a nice day.");
        } else {
            System.out.println("It's a cold day.");
        }

    // Switch Statements (alternative to if/else for multiple conditions)
        switch (degrees) {
            case 30:
                System.out.println("It's a hot day.");
                break;
            case 20:
                System.out.println("It's a nice day.");
                break;
            case 10:
                System.out.println("It's a cold day.");
                break;
            default:
                System.out.println("Temperature not recognized.");
        }

    // Ternary Operator (shorthand for if/else)
        String weather = (degrees > 30) ? "It's a hot day." : "It's a nice day."; // Ternary operator for conditional assignment
        System.out.println(weather); // Prints the weather message. New message is either "It's a hot day." or "It's a nice day."

    // Loops (for, while, do-while)
        // For Loop (repeats a block of code a specific number of times)
        for (int i = 0; i < 5; i++) { // For loop to iterate from 0 to 4
            System.out.println("Iteration: " + i); // Prints the current iteration number. New message is "Iteration: 0", "Iteration: 1", etc.
            break; // Breaks out of the loop after the first iteration
        }

        // While Loop (repeats a block of code while a condition is true)
        int j = 0; // Initializing j for while loop
        while (j < 5) { // While loop to iterate (repeat a process) while j is less than 5
            System.out.println("While Loop Iteration: " + j); // Prints the current iteration number. New message is "While Loop Iteration: 0", "While Loop Iteration: 1", etc.
            j++; // Incrementing (adding) j to avoid infinite loop
            break; // Breaks out of the loop after the first iteration
        }

        // Do-While Loop (similar to while loop, but executes at least once)
        int k = 0; // Initializing k for do-while loop
        do {
            System.out.println("Do-While Loop Iteration: " + k); // Prints the current iteration number. New message is "Do-While Loop Iteration: 0", "Do-While Loop Iteration: 1", etc.
            k++; // Incrementing (adding) k to avoid infinite loop
        } while (k < 5);

        // For-Each Loop (used to iterate over arrays or collections)
        String[] collectionsArray = {"fog", "cloud", "rain", "sun", "snow"}; // Array to iterate over
        for (String condition : collectionsArray) { // For-each loop to iterate over each weather condition in the array.
            System.out.println("For-Each Loop Weather: " + condition); // Prints each weather condition in the array.
        }
    }
}