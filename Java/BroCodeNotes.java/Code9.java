// July 22, 2025

import java.util.Scanner;

// This is about some math stuff
// The Math Class provides methods for mathematical operations. Useful for calculations.

public class Code9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
        System.out.println(Math.PI); // Access Math.constant name
        System.out.println(Math.E);

        double result;

        result = Math.pow(2, 3); // pow method raises base to a power
        System.out.println(result); // Prints "8.0" to the console.

        result = Math.abs(-5);// abs = absolute value. Absolute value is the distance away from 0
        System.out.println(result); // Prints "5.0" to the console.

        result = Math.sqrt(9);// sqrt = square root of a number
        System.out.println(result); // Prints "3.0" to the console.

        result = Math.round(3.14);// round = rounds a number to nearest whole integer
        System.out.println(result); // Prints "3.0" to the console.

        result = Math.ceil(3.14); // ceil = rounded up
        System.out.println(result); // Prints "4.0" to the console.

        result = Math.floor(3.99); // floor = rounded down
        System.out.println(result); // Prints "3.0" to the console.

        result = Math.min(10, 20); // Returns the minimum of two numbers
        System.out.println(result); // Prints "10.0" to the console.

        result = Math.max(10, 20); // Returns the maximum of two numbers
        System.out.println(result); // Prints "20.0" to the console.


        // Hypotenuse: c = Math.sqrt(a² + b²)

        double a;
        double b;
        double c;

        System.out.print("Enter the length of Side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of Side B: ");
        b = scanner.nextDouble();

        System.out.println(a); // just a test code
        System.out.println(b); // just a test code

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); // Square root method

        System.out.println("The hypotenuse (side c) is: " + c + "cm");

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        double radius;
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        double circumference;
        circumference = 2 * Math.PI * radius;
        System.out.println("The circumference is: " + circumference + "cm");

        double area;
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area is: " + area + "cm²");

        double volume;
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        System.out.print("The volume is: " + volume + "cm³");

       
        scanner.close();
    }
}

