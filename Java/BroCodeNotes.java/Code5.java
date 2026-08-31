// July 21, 2025

public class Code5 {
    public static void main(String[] args) {
        // This code is all about the arithmetics.

    // Arithmetic is just basic addition, subtraction, multiplication, division and modulus
        // Arithmetic operators and examples:

            int x = 10; 
            int y = 2;
            int z; 
            
            z = x + y; // Addition
            System.out.println(z); // Prints "12" to the console.

            z = x - y; // Subtraction
            System.out.println(z); // Prints "8" to the console.

            z = x * y; // Multiplication
            System.out.println(z); // Prints "20" to the console.

            z = x / y; // Division
            System.out.println(z); // Prints "5" to the console.

            z = x % y; // Modulus (remainder)
            System.out.println(z); // Prints "0" to the console.

    // Augmented assingment operators condense arithmetic problems 
        // Augmented assignment operators and examples:
            /* Augmented chord is the root, third and a sharp fifth.
            I only know this since I learned some music theory as a percussionist */

            int x1 = 10; 
            int y1 = 2;

            x1 += y1; // Addition. This is a condensed version of x1 + y1 
            System.out.println(x1); // Prints "12" to the console.

            x1 -= y1; // Subtraction. Condensed 
            System.out.println(x1); // Prints "8" to the console.

            x1 *= y1; // Multiplication. This is a condensed version 
            System.out.println(x1); // Prints "20" to the console.

            x1 /= y1; // Division. Condensed
            System.out.println(x1); // Prints "5" to the console.

            x1 %= y1; // Modulus. Condensed
            System.out.println("0"); // Prints "0" to the console.

    // Increment (++) and Decrement (--) Operators are used to increase or decrease the value of a variable by 1.
            
            int x2 = 1; // Equation.
            x2++; // Equivalent to x2 = x2 + 1. Now x2 is 2.
            x2--; // Equivalent to x2 = x2 - 1. Now x2 is 1.

    // Order of Operations (P-E-M-D-A-S)
        /* PEMDAS stands for: 
            Parentheses, Exponenets, Multiplication, Division, Addition and Subtraction: Think "Please, Excuse My Dear Aunt Sally" */

            double result = 3 + 4 * (7-5) / 2.0; // Example
            System.out.println(result); // Prints "7.0" to the console.

            /* Here is how it was solved:
                Start with parentheses first: (7-5). That equals 2.
                Check for exponents. 
                Next multiply: 3 + 4 * 2. Multiply 4*2. That equals 8.
                Then Divide 8 by 2.0, to get 4.0
                Finally add 3 + 4, to get 7. 
                    */


        }
    }
