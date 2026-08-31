// July 30, 2025

public class Code55 {
    public static void main(String[] args) {
    // Wrapper classes = primitive values to be used as objects
        /* from Code 2 as reference, primitive types: 
            int -> integer (whole numbers)
            char -> single character
            double -> decimal number
            boolean -> true or false statements
        */

    // Autoboxing (assign primitives to objects with a wrapper class)
    Integer a = 123;
    Double b = 4.32;
    Character c = '$';
    Boolean d = true;

    // Unboxing (convert object back to primitive)
    int m = a;

    // From data type to string
    String u = Integer.toString(456);
    String v = Double.toString(2.34);
    String w = Character.toString('@');
    String x = Boolean.toString(false);

    String y = u + v + w + x; // String concatenated (joined together)

    System.out.println(x); // Prints "4562.34@false" to the console.

    // From string to data type (Parsing)
    int e = Integer.parseInt("567");
    double f = Double.parseDouble("1.23");
    char g = "Tim the Enchanter".charAt(0); // No parsing, use charAt
    boolean h = Boolean.parseBoolean("true");

    // Miscelleanous Utility Methods
    char letter = 'o';
    System.out.println(Character.isLetter(letter)); // isLetter(letter) is a boolean
    System.out.println(Character.isUpperCase(letter)); // checks if letter is UPPERCASE or not.
    }
}