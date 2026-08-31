// July 22, 2025

// This is about the printf statement

    // printf() = method to format output
    // %[flags][width][. precision][specifier-character]

public class Code10 {

    public static void main(String[] args) {

        String name = "Ozzy Osbourne";
        char firstLetter = 'O';
        int age = 76; // :(
        double height = 176.53;
        boolean isAlive = false; // Long Live the Prince of Darkness

        System.out.printf("Hello %s\n", name); // % = placeholders, s = string, \n = new line insert;
        System.out.printf("Your name starts with %c\n", firstLetter); // c = character;
        System.out.printf("You are %d years old\n", age); // d = integer;
        System.out.printf("You are %f centimeters tall\n", height); // f = double/floating point;
        System.out.printf("Alive %b\n", isAlive); // b = boolean;
        System.out.printf("%s is %d years old ", name, age);

        // Specifiers and their examples
        
        /* [. precision] = digit limiter */

        double price = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;
        
        System.out.printf(".2%f\n", price); // the .2 is for 2 digits
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.2f\n", price3);

        // Flag types and examples:
            /* + = output a plus */
        double price4 = 9.99;
        double price5 = 100.15;
        double price6 = -54.01;
        
        System.out.printf("%+.2f\n", price4);
        System.out.printf("%+.2f\n", price5);
        System.out.printf("%+.2f\n", price6);

        /* , = comma grouping seperator */
        double price7 = 9000.99;
        double price8 = 100000.15;
        double price9 = -54000.01;
        
        System.out.printf("%,.2f\n", price7); // Prints "9,000.99" to the console.
        System.out.printf("%,.2f\n", price8);
        System.out.printf("%,.2f\n", price9);

        /* ( = negative numbers enclosed in () */
        double price10 = 9.99;
        double price11 = 100.15;
        double price12 = -54.01;
        
        System.out.printf("%(.2f\n", price10); // Prints "9.99" to the console. It is a positive number.
        System.out.printf("%(.2f\n", price11); // Prints "100.15" to the console. It is a positive number.
        System.out.printf("%(.2f\n", price12); // Prints "(54.01)" to the console. It is a negative number.

        /* space = displays minus if negative, space if positive */
        double price13 = 9.99;
        double price14 = 100.15;
        double price15 = -54.01;
        
        System.out.printf("% .2f\n", price13); // Prints "9.99" to the console. It is a positive number.
        System.out.printf("% .2f\n", price14); // Prints "100.15" to the console. It is a positive number.
        System.out.printf("% .2f\n", price15); // Prints "-54.01" to the console. It is a negative number.


        /* [width] */

        // 0 = zero padding. Follow placeholder with '0', then the digit amount to '0' pad
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1); // Prints "0001" to the console.
        System.out.printf("%04d\n", id2); // Prints "0023" to the console.
        System.out.printf("%04d\n", id3); // Prints "0456" to the console.
        System.out.printf("%04d\n", id4); // Prints "7890" to the console.

        // number = right justified padding. Just some spaces.
        int id5 = 1;
        int id6 = 23;
        int id7 = 456;
        int id8 = 7890;

        System.out.printf("%4d\n", id5); // Prints " 1" to the console.
        System.out.printf("%4d\n", id6); // Prints " 23" to the console.
        System.out.printf("%4d\n", id7); // Prints " 456" to the console.
        System.out.printf("%4d\n", id8); // Prints "7890" to the console.

        // negative number = left justified padding
        int id9 = 1;
        int id10 = 23;
        int id11 = 456;
        int id12 = 7890;

        System.out.printf("%-4d\n", id9); // Prints "1 " to the console.
        System.out.printf("%-4d\n", id10); // Prints "23 " to the console.
        System.out.printf("%-4d\n", id11); // Prints "456 " to the console.
        System.out.printf("%-4d\n", id12); // Prints "7890" to the console.

    }
}