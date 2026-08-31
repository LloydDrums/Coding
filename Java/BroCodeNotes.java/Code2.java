// July 18, 2025

public class Code2 {
    public static void main(String[] args) {
    // Reference = memory address (Think of reference as someone giving you an IOU that says "I owe you $27")

        // Primitive types and examples:
            /* - int: integer (whole numbers) */

            int age = 19; // Declaring an integer variable named age
            System.out.println(age); // Prints the value of age to the console.
            System.out.println("Your age is " + age); // Prints "Your age is 19" to the console

            int year = 2006; // Declaring an integer variable named year
            System.out.println(year); // Prints the value of year to the console.
            System.out.println("The year is " + year); // Prints "The year is 2006" to the console

            int quantity = 1; // Declaring an integer variable named quantity
            System.out.println(quantity); // Prints the value of quantity to the console.
            System.out.println("Your quantity is " + quantity); // Prints "Your quantity is 1" to the console

           /* - double: decimal number */
           double price = 3.99; // Declaring a double variable named price
           System.out.println(price); // Prints the value of price to the console.
           System.out.println("The price is " + "$" + price); // Prints "The price is $3.99" to the console

            double gpa = 3.6; // Declaring a double variable named gpa
            System.out.println(gpa); // Prints the value of gpa to the console.
            System.out.println("Your GPA is " + gpa); // Prints "Your GPA is 3.6" to the console

            double temperature = 18.6; // Declaring a double variable named temperature
            System.out.println(temperature); // Prints the value of temperature to the console.
            System.out.println("The temperature is " + temperature); // Prints "The temperature is 18.6" to the console

           /* - char: single character */

           char grade = 'B'; // Declaring a char variable named grade
           System.out.println(grade); // Prints the value of grade to the console. Prints "B" to the console
           System.out.println("Your grade is a " + grade); // Prints "Your grade is a B" to the console

           char symbol = '@'; // Declaring a char variable named symbol
           System.out.println(symbol); // Prints the value of symbol to the console.
           System.out.println("You chose the symbol of " + symbol); // Prints "You chose the symbol of @" to the console

           char currency = '$'; // Declaring a char variable named currency
           System.out.println(currency); // Prints the value of currency to the console.
           System.out.println("The currency you chose was " + currency); // Prints "The currency you chose was $" to the console.

           /* - boolean: true or false */
           boolean isAQuietPerson = true; // Declaring a boolean variable named isAQuietPerson
           System.out.println(isAQuietPerson); // Prints the value of isAQuietPerson to the console.
           System.out.println("Are you a quiet person? " + isAQuietPerson); // Prints "Are you a quiet person? true" to the console.

           boolean isAGuitarist = false; // Declaring a boolean variable named isAGuitarist
           System.out.println(isAGuitarist); // Prints the value of isAGuitarist to the console.
           System.out.println("Are you a guitarist? " + isAGuitarist); // Prints "Are you a guitarist? false" to the console.

           boolean isAnIntrovert = true; // Declaring a boolean variable named isAnIntrovert
           System.out.println(isAnIntrovert); // Prints the value of isAnIntrovert to the console.
           System.out.println("Are you an introvert? " + isAnIntrovert); // Prints "Are you an introvert? true" to the console.

           /* For anyone else (and me personally, if you're wondering): I am a quiet person, I am not a guitarist, but a drummer and I am an introverted person. */

        // Reference types and examples:
           /* - String: sequence of characters (text) */
           String name = "Gordon"; // Declaring a String variable named name. 
           System.out.println(name); // Prints the value of name to the console.
           System.out.println("Hello, " + name); // Prints "Hello, Gordon" to the console.

           /* - Arrays: collection of elements */
           String[] hobbies = {"reading", "coding", "playing drums"}; // Declaring an array of Strings named hobbies

           // The index of an array starts at 0, so hobbies[0] refers to the first element in the array.
           System.out.println(hobbies[0]); // Prints the first element of the hobbies array to the console. Prints "reading" to the console.
           System.out.println("Your first hobby is " + hobbies[0]); // Prints "Your first hobby is reading" to the console
           
           System.out.println(hobbies[1]); // Prints the second element of the hobbies array to the console. Prints "coding" to the console
           System.out.println("Your second hobby is " + hobbies[1]); // Prints "Your second hobby is coding" to the console
           
           System.out.println(hobbies[2]); // Prints the third element of the hobbies array to the console. Prints "playing drums" to the console
           System.out.println("Your third hobby is " + hobbies[2]); // Prints "Your third hobby is playing drums" to the console.

           // You can add some more information about yourself using the variables you created above if you want.

           // A combination of primitive types, reference types and arrays.
           System.out.println("Hi, my name is " + name + ". I have a " + gpa + " GPA. I like buying stuff that is " + currency + price + ". I am " + age + " years old, and I enjoy " + String.join(", ", hobbies) + ".");
    }
}